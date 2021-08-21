
package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Feedback;

public class FeedbackDAOImpl implements FeedbackDAO {

	Connection conn = DBUtil.getConnection();
	
	@Override
	public boolean saveFeedback(Feedback feedback) {
		
		String query = "insert into feedback(user_id,user_name,email,user_feedback) values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, feedback.getId());
			ps.setString(2, feedback.getUsername());
			ps.setString(3, feedback.getEmail());
			ps.setString(4, feedback.getFdback());
						
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}

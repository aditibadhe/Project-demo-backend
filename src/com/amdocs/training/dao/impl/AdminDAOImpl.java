
package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Admin;

public class AdminDAOImpl implements AdminDAO {

	Connection conn = DBUtil.getConnection();
	
	@Override
	public boolean saveAdmin(Admin admin) {
		
		String query = "insert into admin values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, admin.getA_id());
			ps.setString(2, admin.getAdmin_name());
			ps.setString(3, admin.getAdmin_email());
			ps.setString(4,admin.getAdmin_password());
						
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}

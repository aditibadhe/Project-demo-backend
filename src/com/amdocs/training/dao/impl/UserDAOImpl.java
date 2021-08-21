package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.User;

public class UserDAOImpl implements UserDAO {

	Connection conn = DBUtil.getConnection();
	
	@Override
	public boolean saveUser(User user) {
		
		String query = "insert into user1(user_name,phone_no,email,address,reg_date,password,upload_photo) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getUsername());
			ps.setDouble(2, user.getPhone());
			ps.setString(3, user.getEmail());
			ps.setString(4,user.getAddress());
			ps.setString(5, user.getDate());
			ps.setString(6, user.getPassword());
			ps.setString(7, user.getImg());
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}

/*package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.model.User;

public class UserDAOImpl implements UserDAO {
	DataSource dataSource = DataSourceUtil.dataSource();
	public UserDAOImpl() throws SQLException{
	Connection conn = dataSource().getConnection();
	}
	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long id = rs.getLong("id");
				String name = rs.getString("username");
				String password = rs.getString("password");
				String email = rs.getString("email");

				String address = rs.getString("address");
				User user = new User(id, name, password, email, address);
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
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

}*/
package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.User;

public class UserDAOImpl implements UserDAO {
	Connection conn;
	public UserDAOImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		
		conn = DataSourceUtil.dataSource().getConnection();
	}
	
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
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return false;
		
	}

}

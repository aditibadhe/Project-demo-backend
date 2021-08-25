/*
package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Contact;

public class ContactDAOImpl implements ContactDAO {

	Connection conn = DBUtil.getConnection();
	
	@Override
	public boolean saveContact(Contact contact) {
		
		String query = "insert into contact(user_id,user_name,email,phone_no,message) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, contact.getId());
			ps.setString(2, contact.getUsername());
			ps.setString(3, contact.getEmail());
			ps.setDouble(4, contact.getPhone());
			ps.setString(5, contact.getMessage());
			
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

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Contact;

public class ContactDAOImpl implements ContactDAO {
	Connection conn;
	public ContactDAOImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		
		conn = DataSourceUtil.dataSource().getConnection();
	}
	
	@Override
	public boolean saveContact(Contact contact) {
		String query = "insert into contact(user_id,user_name,email,phone_no,message) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDouble(1, contact.getId());
			ps.setString(2, contact.getUsername());
			ps.setString(3, contact.getEmail());
			ps.setDouble(4, contact.getPhone());
			ps.setString(5, contact.getMessage());
			ps.executeUpdate();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return false;
		
	}

}


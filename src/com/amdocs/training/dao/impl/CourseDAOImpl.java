/*package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Course;

public class CourseDAOImpl implements CourseDAO {

	Connection conn = DBUtil.getConnection();

	@Override
	public boolean saveCourse(Course course) {
		String query = "insert into course(c_name,c_desc,c_fees,c_resource) values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, course.getCourseName());
			ps.setString(2, course.getDescription());
			ps.setDouble(3, course.getCourseFee());
			ps.setString(4, course.getResources());
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

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Course;

public class CourseDAOImpl implements CourseDAO {
	Connection conn;
	public CourseDAOImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		
		conn = DataSourceUtil.dataSource().getConnection();
	}
	
	@Override
	public boolean saveCourse(Course course) {
		String query = "insert into course(c_name,c_desc,c_fees,c_resource) values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, course.getCourseName());
			ps.setString(2, course.getDescription());
			ps.setDouble(3, course.getCourseFee());
			ps.setString(4, course.getResources());
			ps.executeUpdate();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return false;
		
	}

}

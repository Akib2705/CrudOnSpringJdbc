package com.springAdvance.springJdbc.entites;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DataFetching implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getString(3));
		student.setCity(rs.getString(4));
		student.setCourse(rs.getString(5));

		return student;
	}

}

package com.springAdvance.springJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springAdvance.springJdbc.entites.DataFetching;
import com.springAdvance.springJdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Student student) {
		String sql = "insert into student(id,name,address,city,course) values(?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAddress(),
				student.getCity(), student.getCourse());
		return result;
	}

	public int delete(int id) {
		String sql = "delete from student where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	public int update(Student student) {
		String sql = "update student set name=?,address=?,city=?,course=? where id=?";
		int result = jdbcTemplate.update(sql, student.getName(), student.getAddress(), student.getCity(),
				student.getCourse(), student.getId());
		return result;
	}

	public Student read(int id) {
		String sql = "select * from student where id=?";
		DataFetching rowMapper = new DataFetching();

		Student student = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return student;
	}

	public List<Student> readAll() {
		String sql = "select * from student";
		DataFetching rowMapper = new DataFetching();
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

}

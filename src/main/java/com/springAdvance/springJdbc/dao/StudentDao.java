package com.springAdvance.springJdbc.dao;

import java.util.List;

import com.springAdvance.springJdbc.entites.Student;

public interface StudentDao {

	int save(Student student);

	int delete(int id);

	int update(Student student);

	Student read(int id);

	List<Student> readAll();

}

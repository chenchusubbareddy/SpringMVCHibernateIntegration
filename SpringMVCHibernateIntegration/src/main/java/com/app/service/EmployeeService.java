package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.hb.dao.EmpDao;
import com.app.hb.entity.Student;

@Service
public class EmployeeService {
	
	@Autowired
	private EmpDao dao;

	public List<Student> getAllData() {
		return  dao.getAllStdData();
	}
	
	public String deleteStudent(int studentid) {
		return  dao.deletestudent(studentid);
	}
}

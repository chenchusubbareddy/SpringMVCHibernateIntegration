package com.app.hb.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.hb.entity.Student;

@Repository
public class EmpDao {

	@Autowired
	HibernateTemplate ht;

	public List<Student> getAllStdData() {
		List<Student> loadAll = ht.loadAll(Student.class);
		return loadAll;

	}

	public String deletestudent(int id) {
		Student s = ht.get(Student.class, id);
		System.out.println("s:" + s);
		Session openSession = ht.getSessionFactory().openSession();
		Transaction tx = openSession.beginTransaction();
		openSession.delete(s);
		tx.commit();
		openSession.close();
		return "Student is Deleted";
	}
}

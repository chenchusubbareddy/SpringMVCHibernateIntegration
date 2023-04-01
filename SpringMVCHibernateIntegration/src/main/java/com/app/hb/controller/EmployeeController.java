package com.app.hb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.hb.entity.Student;
import com.app.service.EmployeeService;

@Controller
public class EmployeeController {
  //1.Autowired
	@Autowired
	private EmployeeService es;

	//setter
	@Autowired
	public void setEmployeeService(EmployeeService es) {
		this.es = es;
	}

	//construcor
	@Autowired
	public EmployeeController(EmployeeService es) {
		this.es = es;
	}

	@GetMapping("/getAll")
	public ModelAndView getAll() {
		ModelAndView mav = new ModelAndView("showall");
		List<Student> allData = es.getAllData();
		System.out.println("allData:" + allData);
		mav.addObject("sudentData", allData);
		return mav;

	}

	@GetMapping("/deletestd")
	public ModelAndView deletesid(@RequestParam("sid") int id) {
		ModelAndView mav = new ModelAndView("delete");
		String status = es.deleteStudent(id);
		mav.addObject("status", status);
		return mav;
	}
}

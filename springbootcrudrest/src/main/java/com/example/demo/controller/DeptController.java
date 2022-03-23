package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Dept;
import com.example.demo.bean.Employee;
import com.example.demo.service.DeptService;

@RestController
public class DeptController {
	
	
	@Autowired
	DeptService   service;
	
	
	 @GetMapping("/alldept")
     public  List<Dept>   getAllDepts(){
		
		List<Dept>   deptList= service.getAllDepts();
		return deptList;
	}


}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	
	
	@Autowired
	EmpService   service;
	
	 @GetMapping("/allemp")
     public  List<Employee>   getAllEmployees(){
		
		List<Employee>   empList= service.getAllEmployees();
		return empList;
	}
	 
	 
	 @GetMapping("/selectemp/{empId}")
	 @ResponseBody
	 public Employee selectById(@PathVariable("empId") int empId) {
		 
		 Employee   emp = service.getEmpById(empId);
		 return emp;
	 }
	 
	 
}

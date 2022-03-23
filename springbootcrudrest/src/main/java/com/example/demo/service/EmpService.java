package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmpDAO;

@Service
public class EmpService {
	
	@Autowired
	EmpDAO     dao;
	
	
	public  List<Employee>   getAllEmployees(){
		List<Employee>   empList=(List<Employee>) dao.findAll();
		return empList;
	}
	
	public   Employee getEmpById(int id) {	
		     Optional<Employee>  employee= dao.findById(id);
		     return employee.get();
	}
	
	
	

}

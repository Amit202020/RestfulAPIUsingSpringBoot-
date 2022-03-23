package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Dept;
import com.example.demo.bean.Employee;
import com.example.demo.dao.DeptDAO;

@Service
public class DeptService {
	
	
	@Autowired
	DeptDAO    dao;
	

	public  List<Dept>   getAllDepts(){
		List<Dept>   deptList=(List<Dept>) dao.findAll();
		return deptList;
	}
	

}

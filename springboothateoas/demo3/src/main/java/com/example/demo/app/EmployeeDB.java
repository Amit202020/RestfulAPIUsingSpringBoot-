
package com.example.demo.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {
	 
    public static List<EmployeeVO> getEmployeeList()
    {
        List<EmployeeVO> list = new ArrayList<>();
 
        EmployeeVO empOne = new EmployeeVO(1, "srini", "B", "srini@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2, "navin", "k", "navin@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3, "nik", "k", "nik@gmail.com");
 
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
 
        return list;
    }
}

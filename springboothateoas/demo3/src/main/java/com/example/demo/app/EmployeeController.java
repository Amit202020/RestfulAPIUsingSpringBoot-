
package com.example.demo.app;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public EmployeeListVO getAllEmployees() {
		EmployeeListVO employeesList = new EmployeeListVO();

		for (EmployeeVO employee : EmployeeDB.getEmployeeList()) {
		
			
			
			Link link = linkTo(EmployeeController.class).slash(employee.getEmployeeId()).withSelfRel();
			employee.add(link);

			
			ResponseEntity<EmployeeReport> methodLinkBuilder = methodOn(EmployeeController.class)
					.getReportByEmployeeById(employee.getEmployeeId());
			Link reportLink = linkTo(methodLinkBuilder).withRel("employee-report");
			employee.add(reportLink);
			

			employeesList.getEmployees().add(employee);
		}

		
		Link selfLink = linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel();
		employeesList.add(selfLink);

		return employeesList;
	}

	@GetMapping("/employees/{id}/report")
	public ResponseEntity<EmployeeReport> getReportByEmployeeById(@PathVariable("id") int id) {
		// Do some operation and return report
		return null;
	}
}

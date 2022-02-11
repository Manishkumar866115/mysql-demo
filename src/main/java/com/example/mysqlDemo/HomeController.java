package com.example.mysqlDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("employees")
	public List<Employee> getEmployee() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("add-employee")
	public Employee postEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
}

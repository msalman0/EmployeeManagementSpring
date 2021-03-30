package com.voda.hr.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voda.hr.model.Employee;
import com.voda.hr.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private final EmployeeService employeeService;

	@CrossOrigin(origins = "*")
	@SuppressWarnings("unchecked")
	@GetMapping("")
	public ResponseEntity<List<Employee>> findAllEmployees() {
		final List<Employee> employees = employeeService.findAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	/**
	 * @param employee
	 */
	@CrossOrigin(origins = "*")
	@PostMapping("/add")
	public void addEmployee(@RequestBody final Employee employee) {
		employeeService.addEmployee(employee);
	}

	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") final long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	@CrossOrigin(origins = "*")
	public ResponseEntity<?> updateEmployee(@RequestBody final Employee employee) {
		employeeService.updateEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("{id}")
	@CrossOrigin(origins = "*")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") final long id) {
		final Employee employee = employeeService.findEmployeeById(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	public EmployeeController(final EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// public EmployeeController()
	// {
	//
	// }

}

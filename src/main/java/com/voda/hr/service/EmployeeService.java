package com.voda.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voda.hr.exception.EmployeeNotFoundException;
import com.voda.hr.model.Employee;
import com.voda.hr.repository.EmployeeRepository;


@Service
public class EmployeeService
{
	private final EmployeeRepository employeeRepository;

	/**
	 * @param employee
	 */
	public void addEmployee(final Employee employee)
	{
		employeeRepository.save(employee);
	}

	/**
	 * @param id
	 */
	public void deleteEmployee(final long id)
	{
		employeeRepository.deleteEmployeeById(id);
	}

	/**
	 * @return
	 */
	public List<Employee> findAllEmployees()
	{
		return employeeRepository.findAll();
	}

	public Employee findEmployeeById(final long id)
	{
		return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee not Found with Id" + id));
	}

	@Autowired
	public EmployeeService(final EmployeeRepository employeeRepository)
	{
		super();
		this.employeeRepository = employeeRepository;
	}

	public Employee updateEmployee(final Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}

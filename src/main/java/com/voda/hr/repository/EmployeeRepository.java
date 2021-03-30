package com.voda.hr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.voda.hr.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

	@Transactional
	void deleteEmployeeById(long id);

}

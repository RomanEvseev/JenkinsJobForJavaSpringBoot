package com.rom;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	List<Employee> employeeList = new ArrayList<>();
	
	public EmployeeService() {
		Employee emp = new Employee();
		emp.setEmployeeId(1L);
		emp.setFirstName("JOHN");
		emp.setLastName("DOUGH");
		emp.setEmail("john.dough@abc.com");
		emp.setPhoneNumber("416 555 33 444");
		emp.setJobId("000222");
		employeeList.add(emp);
	}
	
	List<Employee> getAllEmployee(){
		return employeeList;
	}
	
	Employee getEmployeeById(Long employeeId){
		Optional<Employee> employee = employeeList.stream()
				  .filter(empl -> employeeId == empl.getEmployeeId())
				  .findAny();
		return employee.isPresent()? employee.get():null;
	}
	

}

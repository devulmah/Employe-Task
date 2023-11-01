package com.ct.java;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	 public static List<Employee> employees = new ArrayList<>();
	static {
		employees.add(new Employee(15323, "saikumar", 5723.21, "associate", "hyd"));
		employees.add(new Employee(12536, "arun", 2336.13, "junior associate", "chenni"));
		employees.add(new Employee(12321, "mahsh", 2352.123, "senior manager", "dubai"));
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(List<Employee> employees) {
		EmployeeRepository.employees = employees;
	}

}

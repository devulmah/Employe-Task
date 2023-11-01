package com.ct.java;

import java.util.List;

public class main {

	public static void main(String[] args) {

		EmployeeServices service = new EmployeeServices();
		Employee emp = service.getEmployee(15323, "saikumar");
		if (emp == null) {
			System.out.println("enter valid details");
		} else {
			System.out.println(emp);
		}

		List<Employee> list = service.getEmployee(10000.0);
		for (Employee emp1 : list) {
			System.out.println(emp1);

		}

	}

}

package com.ct.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeServices {
	List<Employee> list = EmployeeRepository.getEmployees();
    public Employee getEmployee(int id,String name) {
    Iterator<Employee>itr=list.iterator();
    
    while(itr.hasNext()){
    	Employee emp=itr.next();

    	if(emp.getId()==id&&emp.getName().equals(name)	) {
    		return emp;
    		
    	}
    	else
    		return null;
    }
	return null;
    }
	public List<Employee> getEmployee(Double salary) {
		List<Employee>list=new ArrayList<>();
		 Iterator<Employee>itr=list.iterator();
		    
		    while(itr.hasNext()){
				Employee emp=itr.next();

		    	if(emp.getSalary()>salary	) 
		    		list.add(emp);
		    }
		    			
		    		
		    		return list;
		    		}
		    		
		    		
		
		

	
	public void setList(List<Employee> list) {
		this.list = list;
	}
}

	
    	
    
	
    
	
	
    


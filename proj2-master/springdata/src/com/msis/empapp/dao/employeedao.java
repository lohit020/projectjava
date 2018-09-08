package com.msis.empapp.dao;

import java.util.List;

import com.msis.empapp.dto.employee;
import com.msis.empapp.exception.employeeexception;

public interface employeedao {

	 public List<employee> getallemployees() throws employeeexception;
	 public List<employee> addemployee(employee emp) throws employeeexception;
	
}

package com.msis.empapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msis.empapp.dao.employeedao;
import com.msis.empapp.dto.employee;
import com.msis.empapp.exception.employeeexception;
@Service
@Transactional
public class employeeserviceimpl implements employeeservice {
     @Autowired
     employeedao employeeDao;
     
	@Override
	public List<employee> getallemployees() throws employeeexception {
		
		return employeeDao.getallemployees();
	}

	@Override
	//@Transactional
	public List<employee> addemployee(employee emp) throws employeeexception {
		
		return employeeDao.addemployee(emp);
		
	}
	

}

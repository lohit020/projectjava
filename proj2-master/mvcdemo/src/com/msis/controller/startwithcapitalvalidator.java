package com.msis.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class startwithcapitalvalidator implements 
                       ConstraintValidator<startwithcapital, String> 
{

	@Override
	public void initialize(startwithcapital arg0) {
		
		
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		if(Character.isUpperCase(name.charAt(0)))
		{
			return true;
		}
		return false;
	}

 
}

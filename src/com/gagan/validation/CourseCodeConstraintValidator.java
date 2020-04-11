/**
 * Gagandeep
 * 3:08:14 pm
 * 04-Apr-2020
 */
package com.gagan.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();	// map the value which will be used to validate an input string
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = false;
		if(code!=null)
			result = code.startsWith(coursePrefix);
		return result;
	}

}
//ConstraintValidatorContex -> used to place additional error message
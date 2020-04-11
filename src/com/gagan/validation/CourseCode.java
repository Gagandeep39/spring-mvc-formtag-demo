/**
 * Gagandeep
 * 2:57:03 pm
 * 04-Apr-2020
 */
package com.gagan.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)	// lass that will peform validation	
@Target({ElementType.METHOD, ElementType.FIELD}) //Where are we supposed to apply the annotation
@Retention(RetentionPolicy.RUNTIME) // Validation must be applied at runtime
public @interface CourseCode {	
	
	public String value() default "ABC";	// Wil take a value from user, else default value woill be used
	public String message() default "Must start with ABC";	//Defult error message if user doesnt provide one
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default{};
	
	// Demo of how this annotation can be used
//	@CourseCode(value="XYZ", message = "lol this is a mssage")
//	private String code;

}

package io.mvcAssignments;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target(ElementType.FIELD)
@Constraint(validatedBy = zipcodeValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidZipcode {

	String message() default "please give appropriate zipcodes for the selcted city";
	
	Class<?> [] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
}

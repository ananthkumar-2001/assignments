package io.mvcAssignments;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ContactValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidContact {
	
	String message() default "Please provide correct contact number of 10 digits containig only numeric values";

	Class<?> [] groups() default {};
	
	Class<? extends Payload> [] payload() default{};
}

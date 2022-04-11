package io.mvcAssignments;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactValidator implements ConstraintValidator<IsValidContact, Long> {
	
	public void initialize(IsValidContact isValidContact) {
		
	}

	public boolean isValid(Long contact, ConstraintValidatorContext context) {
		if(contact == null) {
			return false;
		}
		long sum = 0;
		while(contact>0) {
			contact = contact/10;
			sum++;
		}
		if(sum==10) {
			return true;
		}
		else {
			return false;
		}
	}

}

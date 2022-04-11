package io.mvcAssignments;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class zipcodeValidator implements ConstraintValidator<IsValidZipcode, Long> {

	public boolean isValid(Long zipCode, ConstraintValidatorContext context) {
		
		if(zipCode==null) {
			return false;
		}
		
		Map<Long, String> zipcodes = new HashMap<Long, String>();
		zipcodes.put((long) 522001,"Pune");
		zipcodes.put((long) 522002,"Delhi");
		zipcodes.put((long) 522003,"Hyderabad");
		zipcodes.put((long) 522004,"Banglore");
		
		Customer customer = new Customer();
		String cityString = customer.getCity();
		
		return false;
	}

}

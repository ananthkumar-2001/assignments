package io.mvcAssignments;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class registrationController {
	
	
	@RequestMapping(value = "/register.html",method = RequestMethod.GET)
	public ModelAndView getRegistrationForm() {
		
		ModelAndView model1 = new ModelAndView("registration");
		
		return model1;
	}
	
	@RequestMapping(value = "/afterregister",method = RequestMethod.POST)
	public ModelAndView getAfterRegistrationForm(@Valid @ModelAttribute("cust1") Customer customer, BindingResult result) {
		
		if(result.hasErrors()) {
			
			ModelAndView model1 = new ModelAndView("registration");
			
			return model1;
		}
		
		ModelAndView model1 = new ModelAndView("afterRegistration");
		
		return model1;
	}
}

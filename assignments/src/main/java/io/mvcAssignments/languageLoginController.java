package io.mvcAssignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class languageLoginController {
	
	@RequestMapping("/languageLogin.html")
	public ModelAndView getLogin() {
		
		ModelAndView model1 = new ModelAndView("languagelogin");
		return model1;
	}
}

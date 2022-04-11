package io.mvcAssignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {

	@RequestMapping("/login.html")
	public ModelAndView getLoginForm() {
		
		ModelAndView model1 = new ModelAndView("login");
		return model1;
	}
	
	@RequestMapping("/afterLogin.html")
	public ModelAndView afterLogin(@ModelAttribute("user1") userModel user1) {
		
		ModelAndView model1;
		
		if(user1.getUserName()=="ananth996" && user1.getPassword()=="ananth@996") {
			
			model1 = new ModelAndView("Success");
			return model1;
		}
		else {
			model1 = new ModelAndView("Error");
			return model1;
		}
	}
}

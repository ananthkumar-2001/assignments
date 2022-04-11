package io.mvcAssignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
	}
	
	@RequestMapping("/helloWorld")
	public ModelAndView HelloWorld() {
		
		ModelAndView modelAndView = new ModelAndView("helloWorld");
		
		return modelAndView;
	}
}

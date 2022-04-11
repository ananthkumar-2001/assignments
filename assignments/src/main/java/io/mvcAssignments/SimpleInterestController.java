package io.mvcAssignments;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {

	@RequestMapping(value = "/simpleInterestForm.html", method = RequestMethod.GET)
	public ModelAndView SIForm() {
		
		ModelAndView siView = new ModelAndView("simpleInterest");
		
		return siView;
	}
	
	@RequestMapping(value="/simpleInterestCalculator.html",method = RequestMethod.POST)
	public ModelAndView SICalculator(@RequestParam Map<Double,Double> pathMap) {
		
		Double principal =  pathMap.get("principalAmount");
		Double time = pathMap.get("timeSpan");
		Double ROI = pathMap.get("ROI");
		
		Double interest = (principal*time*ROI)/100;
		
		ModelAndView siCalView = new ModelAndView("SICalculator");
		
		siCalView.addObject("msg","The Simple interest for Amount "+principal+" for "+time+" at "+ROI+" of Interest is :"+interest);
		
		return siCalView;
	}
}

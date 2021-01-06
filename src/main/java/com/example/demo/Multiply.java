package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Multiply {
	 
	@RequestMapping("mul")
	public ModelAndView mul(Values values) {
		
		
	
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", values);
		
		mv.setViewName("Multiply");
		return mv;
	}

}

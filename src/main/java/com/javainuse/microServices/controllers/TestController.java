package com.javainuse.microServices.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("")
	public ModelAndView firstPage() {
		return new ModelAndView("hello");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome");
	}

}

package com.nagarro.LibraryManagementFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class homeController {
	
	@RequestMapping("/")
	public String loginPage() {
		return "home";
	}
}

package com.office.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnquiryController {

	@GetMapping("/add")
	public String addEnquiry() {
		return "add_enquiry";
	}
	
	@GetMapping("/view")
	public String showEnquiryList() {
		return "view_enquiry";
	}
}

/**
 * Gagandeep
 * 8:56:27 am
 * 04-Apr-2020
 */
package com.gagan.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// this key name will be used to refer as modelAttribute name in jsp
		// Can be any name but the same mst be specified in desnation jsp page
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	 
	@RequestMapping("/processForm")
	public String validateForm(
		@Valid
		@ModelAttribute("customer") Customer customer,
		BindingResult bindingResult
			) {
		System.out.println(customer);
		System.out.println(bindingResult);
		if(bindingResult.hasErrors())
			return "customer-form";
		return "customer-confirmation";
	}
	// Data returned will be mapped to customer implicitly as it is an object of custoer class
	// Cannot be any name

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, editor);
		
	}
}

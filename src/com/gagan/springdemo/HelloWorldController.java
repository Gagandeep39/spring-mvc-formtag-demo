package com.gagan.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")	//Added parent request mapping
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	/**
	 * Using HttpServlet request
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String message = request.getParameter("studentName");
		message = message.toUpperCase();
		model.addAttribute("message", message);
		return "helloworld";
	}

	/**
	 * Using @RequestParam()
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "helloworld";
	}

}

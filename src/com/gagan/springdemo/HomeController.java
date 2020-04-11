package com.gagan.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Creating using following jars
 * Spring 5.2.5
 * Hibernate validator 6.1.2
 * javax.servlet.jsp.jstl-1.2.1
 * javax.servlet.jsp.jstl-api-1.2.1
 * servlet-api.jar
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	/**
	 * Request mapping specifies the URL to which ithis method is mapped to
	 * @return
	 */
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}

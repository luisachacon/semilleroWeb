package com.youtube.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
	
@RequestMapping("/")
	public String getIndexPage() {
		
		return "index";
	}

}

package com.spring123;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {
@RequestMapping("/home2")
public String home2()
{
	
return "ramraj";
}
                   
}

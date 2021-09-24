package com.spring123;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Model.UserDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller	
public class HomeController {
  static	long cout=1;
private int count;
	@RequestMapping("/login")
	public String login(HttpServletRequest req,Model m) {
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		if(password.equals("password")) {
			String message="hello"+name;
			m.addAttribute("message",message);
		return "HOME";
	
		}
		else{
			String message="Sorry"+name+"you entered wrong password";
			m.addAttribute("message",message);
			return "errorpage";
		}
		
		
		
	}	
	
	
	
	
	
	
	
	//without request param 
	//with @modelAttribute
	@RequestMapping(path="/registration",method=RequestMethod.POST)
	public String registration(@ModelAttribute UserDao user, Model m)
	{
		System.out.println(user)	
	//***
		m.addAttribute("header","gaurav khade")
		
		return "HOME";
		
	}
	//with @request param
	//without @ModelAttribute
	@RequestMapping("/registration")
	public String registration(@RequestParam(name) String name,@RequestParam(password) String password,@RequestParam(email) String email, Model m)
	{
	/*	if(password.equals("password"))
			{
			count++;
			ArrayList Student =new ArrayList();
			Student.add(name);
		Student.add(email);
		Student.add(password);
		return "Home";
			}else {
				
				return "errorpage" ;
			}
		--->*/
		
		UserDao user =new UserDao;
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		System.out.println(user);
		m.addAttribute("user"user);
		
		return "HOME";
		
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/home")
	public String home() { 
		return "HOME" ;
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/men")
	public String men(){
		return "men";
	}
	
	
	@RequestMapping("/women")
	public String women()
	{return "women";}
	
	@RequestMapping("kids")
	public String kids() {return "kids";}
	
	
	@RequestMapping("/electronic")
	public String electronics() {return "elctronic";}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

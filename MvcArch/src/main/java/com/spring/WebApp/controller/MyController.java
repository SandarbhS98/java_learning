package com.spring.WebApp.controller;

import java.awt.List;
import java.nio.file.attribute.AclEntry;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.WebApp.Model.MyModel;
import com.spring.WebApp.Model.UserDTO;
import com.spring.WebApp.service.MyService;

//@RequestMapping("/")
//@Component
@Controller
public class MyController {

	@Autowired
	MyService service;
	
	@RequestMapping("/link1")
	public String firstmeth() {

		return "resp1";
	}

	@RequestMapping("/link2")
	public String secmeth() {
		return "resp2";
	}

	@RequestMapping("/link3")
	public ModelAndView thirmeth() {
		MyModel model = new MyModel();
		model.setId(10);
		model.setName("JhonSnow");

		return new ModelAndView("resp3", "keyNam", model);
	}

	@RequestMapping("/link4")
	public String fourthmeth() {
		return "resp4";
	}

	@RequestMapping("/link5")
	public String fifthhmeth() {
		return "resp5";
	}
	
	@RequestMapping("/link6")
	public ModelAndView viewlist( ) {
		ArrayList<MyModel> listtt = new ArrayList<MyModel>();
		MyModel m1 = new MyModel(101, "nodel1");
		MyModel m2 = new MyModel(102, "nodel2");
		MyModel m3 = new MyModel(103, "nodel3");
		MyModel m4 = new MyModel(103, "nodel3");
		listtt.add(m1);
		listtt.add(m2);
		listtt.add(m3);
		listtt.add(m4);
		
		ModelAndView andView = new ModelAndView();
		andView.setViewName("resp6");
		andView.addObject("liststs", listtt);
		//return new ModelAndView("resp6", "listss","List is Below") ;
		return andView ;
		
		
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// @RequestMapping( "/login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		if (username.equals("Stark") && password.equals("471201")) {
			System.out.println("Login Successfull");
			return new ModelAndView("success", "usr", username);
		} else {
			return new ModelAndView("resp4", "msg", "Login Failed");
		}

	}
	
//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public ModelAndView registration(@ModelAttribute UserDTO dto) {
//		
//		boolean status = service.register(dto);
//		if (dto.getId() > 20 && dto.getAge() != 0 ) {
//			System.out.println("regist Successfull"); 
//			return new ModelAndView("success", "usr", dto.getUsername());
//		} else if (dto.getUsername().isEmpty() )    {
//			System.out.println("username empty");
//			return new ModelAndView("resp5", "uss", "Please Enter your UserName & Age");
//		} else {
//			return new ModelAndView("resp5", "msg", "Registration Failed");
//		}
//	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute UserDTO dto) {
		
		boolean status = service.register(dto);
		if (status ) {
			System.out.println("regist Successfull"); 
			return new ModelAndView("success", "usr", dto.getUsername());
		} else if (dto.getUsername().isEmpty() )    {
			System.out.println("username empty");
			return new ModelAndView("resp5", "uss", "Please Enter your UserName & Age");
		} else {
			return new ModelAndView("resp5", "msg", "Registration Failed");
		}
	}
} 


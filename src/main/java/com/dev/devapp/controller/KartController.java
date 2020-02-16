package com.dev.devapp.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.devapp.dto.KartDTO;
import com.dev.devapp.service.KartService;

@Controller
@RequestMapping("/")
public class KartController {

	@Autowired
	private KartService service;

	public KartController() {
		// TODO Auto-generated constructor stub
	}

	//@RequestMapping(value = "/home.de", method = RequestMethod.POST)
	@PostMapping("/home.de")
	public String saveKart(@ModelAttribute KartDTO dto , HttpServletRequest req) {
		
		if (Objects.nonNull(dto)) {
			service.kartService(dto);
			req.setAttribute("key", dto.getItem());
			
		} else {
			System.out.println("data invalid");
		}
		
return "/home.jsp";
	}
	
	
	
}
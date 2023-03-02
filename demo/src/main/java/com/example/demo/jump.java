package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class jump {
	@RequestMapping("hiii")
	
	public String Red(HttpServletRequest req) {
		String name=req.getParameter("name");
		HttpSession session=req.getSession();
		session.setAttribute("myname", name);
		return "NewFile.jsp";
	}

}

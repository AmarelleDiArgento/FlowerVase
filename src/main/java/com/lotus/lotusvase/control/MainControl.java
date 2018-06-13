package com.lotus.lotusvase.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainControl {
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String response = "Bienvenido";
		return response;
	}
}

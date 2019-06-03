package com.ud.libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControlador {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}

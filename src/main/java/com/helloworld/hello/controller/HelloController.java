package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("Hello1")
	public String hello() {
		
		return "Hello World!  Atenção aos detalhes, Persistência, Comunicação, Responsabilidade Pessoal" ;
	}
	
	@RequestMapping("Hello2")
	public String helloW() {
		
		return "Hello World!  Atenção aos detalhes, Persistência, Comunicação, Responsabilidade Pessoal" ;
	}

}

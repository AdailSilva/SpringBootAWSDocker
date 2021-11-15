package com.adailsilva.cloud.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-aws-docker")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	private List<String> all() {
		return Arrays.asList("Adail Silva", "Seja Bem vindo");
	}
}

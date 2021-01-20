package com.san.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String hellWorld() {
		return "HelloWorld";
	}
}

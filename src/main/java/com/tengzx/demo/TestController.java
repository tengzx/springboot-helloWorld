package com.tengzx.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hello")
	public ResponseEntity<String> hello() {
		
		return new ResponseEntity<String>("hello world!", new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping("/hello3")
	public ResponseEntity<String> hello3() {
		
		return new ResponseEntity<String>("hello world 3 !", new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping("/hello2")
	public ResponseEntity<String> hello(String value) {
		
		return new ResponseEntity<String>(value, new HttpHeaders(), HttpStatus.OK);
	}

}

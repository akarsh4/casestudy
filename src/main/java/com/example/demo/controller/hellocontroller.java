
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
@RequestMapping("/new")
public String sayHi() {
	return "Hello";
	    }  
	}

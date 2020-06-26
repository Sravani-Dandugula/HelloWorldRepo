package com.example.first;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class HelloWorld {
	
@RequestMapping("/")
@ResponseBody	
public String hello()
{ 
	//console.log("Hello");
	return "Hellooooooooooo OPTUMMMMMMMMMMMMM!!";
}
}

package com.tcf.boot.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * TODO TCF SpringBoot项目启动
 * @author 71485
 *
 */
@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class DemoController {

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoController.class,args);
	}
	
	@RequestMapping("/show.do")
	public String show()
	{
		return String.format("Hello,Welcome to use SpringBoot! %s","mhw");
	}
}

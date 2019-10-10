package cn.yin.springboot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloWordController {
	
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;
	
	@Resource
	private Environment environment;


	@RequestMapping("info")
//	@ResponseBody
	public String info(){
		System.out.println("name:"+ name);
		System.out.println("url:"+ url);
		
//		String n = environment.getProperty("name");
//		String u = environment.getProperty("url");
//		System.out.println("n:"+n+" u:"+u);
		return "hello word";
	}
}

package cn.yin.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import cn.yin.springboot.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.yin.springboot.pojo.User;

@RestController
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping("/list/{username}")
	public List<User> list(@PathVariable String username){
		List<User> users = userService.selectUsersByUserName(username);
		return users;
	}

	@RequestMapping("/listAll")
	public List<User> listAll(){
		List<User> users = userService.selectUsers();
		return users;
	}
}

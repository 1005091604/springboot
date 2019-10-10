package cn.itcast.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;

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

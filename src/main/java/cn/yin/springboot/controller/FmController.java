package cn.yin.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yin.springboot.pojo.User;
import cn.yin.springboot.service.UserService;

@Controller
public class FmController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/fm")
	public String fm(Model model){
		List<User> users = userService.selectUsers();
		model.addAttribute("users", users);
		return "list";
	}
}

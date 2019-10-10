package cn.yin.springboot.service;

import java.util.List;

import cn.yin.springboot.pojo.User;

public interface UserService {

	public List<User> selectUsersByUserName(String username);
	
	public List<User> selectUsers();
}

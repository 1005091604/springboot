package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.User;

public interface UserService {

	public List<User> selectUsersByUserName(String username);
	
	public List<User> selectUsers();
}

package cn.itcast.springboot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> selectUsersByUserName(String username) {
		return userMapper.selectUsersByUserName(username);
	}

	@Override
	public List<User> selectUsers() {
		return userMapper.selectUsers();
	}

}

package cn.yin.springboot.service;

import java.util.List;

import javax.annotation.Resource;

import cn.yin.springboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

import cn.yin.springboot.pojo.User;

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

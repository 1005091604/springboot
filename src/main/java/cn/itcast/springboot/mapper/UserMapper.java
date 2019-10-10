package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.User;

@Mapper
public interface UserMapper {

	@Select("select * from user where user_name like '%${value}%'")
	public List<User> selectUsersByUserName(String username);

	@Results({
			@Result(property = "username", column = "user_name")
	})
	@Select("select * from user")
	public List<User> selectUsers();
}

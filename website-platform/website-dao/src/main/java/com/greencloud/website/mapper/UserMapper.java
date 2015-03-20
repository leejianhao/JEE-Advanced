package com.greencloud.website.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.greencloud.website.entity.User;

public interface UserMapper {
	
	@Select("select * from t_user where username=#{username}")
	User selectByName(@Param("username") String username);
	
	User load(@Param("id") Long id);
}

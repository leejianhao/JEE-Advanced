package com.greencloud.website.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.greencloud.basic.dao.BaseDao;
import com.greencloud.website.dao.IUserDao;
import com.greencloud.website.entity.User;
import com.greencloud.website.mapper.UserMapper;

@Repository("userDao")
public class UserDaoImpl extends BaseDao<User> implements IUserDao {
	
    @Resource
	private UserMapper userMapper;
	
	@Override
	public User findByName(String username) {
		return userMapper.selectByName(username);
	}

}

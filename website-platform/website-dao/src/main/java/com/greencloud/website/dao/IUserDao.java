package com.greencloud.website.dao;

import com.greencloud.basic.dao.IBaseDao;
import com.greencloud.website.entity.User;


public interface IUserDao extends IBaseDao<User> {
	User findByName(String username);
}

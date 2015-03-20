package com.greencloud.website.service;

import com.greencloud.website.entity.User;



public interface IUserService extends IService {
	User findByName(String username);
}

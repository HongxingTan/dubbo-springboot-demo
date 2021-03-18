package com.alitantan001.gmall.service;

import com.alitantan001.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}

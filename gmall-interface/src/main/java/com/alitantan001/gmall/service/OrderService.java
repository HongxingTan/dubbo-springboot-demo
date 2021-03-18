package com.alitantan001.gmall.service;

import com.alitantan001.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    List<UserAddress> initOrder(String userId);
}

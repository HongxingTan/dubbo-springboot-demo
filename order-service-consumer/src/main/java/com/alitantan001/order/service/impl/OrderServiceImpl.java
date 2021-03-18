package com.alitantan001.order.service.impl;

import com.alitantan001.gmall.bean.UserAddress;
import com.alitantan001.gmall.service.OrderService;
import com.alitantan001.gmall.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}

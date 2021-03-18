package com.alitantan001.service.impl;


import com.alitantan001.gmall.bean.UserAddress;
import com.alitantan001.gmall.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {


    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        List<UserAddress> userAddressList = new ArrayList<>();

        UserAddress userAddress1 = new UserAddress();
        userAddress1.setAddress("谭家营");

        UserAddress userAddress2 = new UserAddress();
        userAddress2.setAddress("徐睦庄");

        if (userId.equals("1"))

            userAddressList.add(userAddress1);

        else

            userAddressList.add(userAddress2);

        return userAddressList;
    }
}

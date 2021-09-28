package com.wllx.service;

import com.wllx.bean.Guest;

import com.wllx.dao.GuestDao;
import com.wllx.dao1.GuestDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 15:57:47
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Service
public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestDao dao;

    @Autowired
    private GuestDao1 dao1;
//    @Autowired
//    private GuestDao1 dao1;
//    @Autowired
//    private GuestMapper guestMapper;

    @Override
    public List<Guest> list() {
        return dao1.selectAll();
    }



}

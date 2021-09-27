package com.wllx.service;

import com.wllx.bean.Guest;
import com.wllx.repository.GuestRepository;
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
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();
    }



}

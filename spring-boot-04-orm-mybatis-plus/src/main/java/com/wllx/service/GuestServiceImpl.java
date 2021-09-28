package com.wllx.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wllx.bean.Guest;
import com.wllx.mapper.GuestMapper;
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
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements GuestService{

//    @Autowired
//    private GuestDao dao;
//    @Autowired
//    private GuestMapper mapper;
//
//    @Override
//    public List<Guest> list() {
//        return mapper.selectList(null);
//    }



}

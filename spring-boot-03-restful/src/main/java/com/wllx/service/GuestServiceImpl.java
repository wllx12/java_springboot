package com.wllx.service;

import com.wllx.bean.Guest;
import com.wllx.dao.GuestDao;
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
    private GuestDao guestDao;
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }


}

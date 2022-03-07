package com.wllx.service;

import com.wllx.bean.Guest;
import com.wllx.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 15:57:47
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@CacheConfig(cacheNames = "guests")
@Service
public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestDao dao;



    @Override
    public List<Guest> list() {
        return dao.selectAll();
    }

//    @Cacheable("guest")
    @Cacheable(/*cacheNames = "guests",*/ key = "#id"/*,condition = "#id>1", unless = "#id>1"*/)
    @Override
    public Guest getGuestById(int id) {
        System.out.println("查询=="+id+"==嘉宾");
        return dao.getGuestById(id);
    }

    @CachePut(/*cacheNames = "guests",*/key = "#guest.id")
    @Override
    public Guest updateGuest(Guest guest) {
        System.out.println("更新第"+guest.getId()+"位嘉宾");
        dao.updateGuest(guest);
        return guest;
    }

    @CacheEvict(/*cacheNames = "guests",*/key = "#id")
    @Override
    public void deleteGuest(int id) {
        System.out.println("删除第"+id+"位嘉宾");
        dao.deleteGuest(id);
    }

    /**
     * allEntries 删除所有缓存
     * beforeInvocation  在方法前删除
     */
    @CacheEvict(/*cacheNames = "guests",*/allEntries = true,beforeInvocation = true)
    @Override
    public void deleteAllGuest() {
        dao.deleteAllGuest();
    }
}

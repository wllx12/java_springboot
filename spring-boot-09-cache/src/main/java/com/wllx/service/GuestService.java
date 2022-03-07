package com.wllx.service;


import com.wllx.bean.Guest;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:32:55
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public interface GuestService {
    List<Guest> list();

    Guest getGuestById(int id);

    /**
     * 使用缓存时  会把方法的返回值放入缓存中存储
     * 此时的返回值是特殊的   不是原来的void or int
     * @return
     */
    Guest updateGuest(Guest guest);


    void deleteGuest(int id);

    void deleteAllGuest();
}

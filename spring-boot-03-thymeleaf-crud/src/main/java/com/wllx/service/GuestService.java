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

    void add(Guest guest);
}

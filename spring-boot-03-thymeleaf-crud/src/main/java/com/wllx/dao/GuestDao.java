package com.wllx.dao;

import com.wllx.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:35:10
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Repository
public class GuestDao {
    static ArrayList list = new ArrayList();
    static {
        list.add(new Guest("黄晓明","店长"));
        list.add(new Guest("秦海璐","财务"));
        list.add(new Guest("林述巍","总厨"));
        list.add(new Guest("王俊凯","经理"));
        list.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        return list;
    }


    public void add(Guest guest){
        list.add(guest);
    }
}

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
    static ArrayList<Guest> getList = new ArrayList();
    static {
        getList.add(new Guest("黄晓明","店长"));
        getList.add(new Guest("秦海璐","财务"));
        getList.add(new Guest("林述巍","总厨"));
        getList.add(new Guest("王俊凯","经理"));
        getList.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        return getList;
    }


    public void add(Guest guest){
        getList.add(guest);
    }
    public void update(Guest guest){
        Guest oldguest=get(guest.getName());
        if(null!=oldguest){
            oldguest.setRole(guest.getRole());
        }

    }
    public Guest get(String name){
        for(Guest guest:getList){
            if(guest.getName().equals(name)){
                return guest;
            }
        }
        return null;
    }

    public void delete(String name){
        getList.remove(get(name));
    }
}

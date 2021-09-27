package com.wllx.dao;

import com.wllx.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/27 16:31:41
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
//@Mapper
public interface GuestDao {
    @Select("select id,name,role from guest")
    List<Guest> selectAll();
}

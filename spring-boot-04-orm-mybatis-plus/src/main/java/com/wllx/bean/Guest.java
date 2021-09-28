package com.wllx.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:30:10
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Guest implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String role;
}

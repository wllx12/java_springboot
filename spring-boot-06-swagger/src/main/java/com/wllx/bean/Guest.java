package com.wllx.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/10 20:31:28
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@ApiModel("嘉宾")
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("角色")
    private String role;
}

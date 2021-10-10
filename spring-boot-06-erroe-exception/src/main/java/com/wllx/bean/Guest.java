package com.wllx.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/09 14:44:00
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {
    @NotBlank(message = "{guest.name.notblank}")
    private String name;
    @NotBlank
    private String role;

}

package com.wllx.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:30:10
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Entity
@Data@AllArgsConstructor@NoArgsConstructor

public class Guest implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}

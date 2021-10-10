package com.wllx;

import com.wllx.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/09 15:12:40
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public class GuestValidTest {
    public static void main(String[] args) {
//        创建一个validator 实例 (普通模式)
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();//        创建一个快速失败模式
        Validator validationFastFail=Validation.byDefaultProvider().configure().addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
//        创建一个不符合的要求的bean
        Guest guest = new Guest("", "");
//        接收验证结果
        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
        violationSet.forEach(v -> {
            System.out.println(v.getPropertyPath() + "======" + v.getMessage());
        });

        System.out.println("==============================");

//        快速失败
        Set<ConstraintViolation<Guest>> violationFastFailSet = validationFastFail.validate(guest);
        for (ConstraintViolation<Guest> v:violationFastFailSet){
            System.out.println("FastFail:   "+v.getPropertyPath() + "======" + v.getMessage());
        }

    }
}

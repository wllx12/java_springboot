package com.wllx.controller;

import com.wllx.bean.Guest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/09 18:03:49
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
public class GuestController {

    /**
     * @Method: add
     * @Description: @Valid 直接放在bean前面用来校验是否符合注解规则
     *               校验不通过返回400 和失败原因。
     *               处理方式是 普通模式 遍历全部属性，返回全部失败结果
     * @Param: [com.wllx.bean.Guest]->[guest]
     * @Return: java.lang.String
     * @Author: wllx
     * @Date: 2021/10/9 0009  18:05
     */
    @PostMapping("/guest")
    public String add(@Valid Guest guest, BindingResult result){
        //返回自定义结果。 通过, BindingResult result参数 要在@Valid Guest guest  紧挨着后面
        if(result.getErrorCount()>0){
            List<FieldError> fieldErrors=result.getFieldErrors();
            StringBuffer stringBuffer=new StringBuffer();
            fieldErrors.forEach(v->{
                stringBuffer.append(v.getField());
                stringBuffer.append("\t");
                stringBuffer.append(v.getDefaultMessage());
                stringBuffer.append("\n");

            });
            return stringBuffer.toString();
        }
        return "success";
    }
}

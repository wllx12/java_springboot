package com.wllx.controller;



import com.wllx.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:31:22
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
@RequestMapping("/guest")
@Api(tags = {"嘉宾相关借口"},value = "对嘉宾进行增删改查")
public class GuestController {

    @ApiOperation("查询嘉宾列表")
    @GetMapping
    public String list(Model model){
        return "list";
    }

    @ApiIgnore
    @GetMapping("/toadd")
    public String toadd(){
        return "add";
    }

    @ApiOperation("增加嘉宾")
    @PostMapping
    public String add(Guest guest){
        return "add guest";
    }

    @ApiIgnore
    @GetMapping("/toupdate/{name}")
    public String toupdate(Model model,@PathVariable("name") String name){
        return "update";
    }

    @ApiOperation("更新嘉宾接口")
    @PutMapping
    public String update(Guest guest){
        return "update guest";
    }

    @ApiOperation("删除嘉宾接口")
    @ApiImplicitParam(name = "name",value = "嘉宾姓名1")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        return "del guest";

    }
}

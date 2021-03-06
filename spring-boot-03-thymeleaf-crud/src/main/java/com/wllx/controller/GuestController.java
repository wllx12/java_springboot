package com.wllx.controller;

import com.wllx.bean.Guest;
import com.wllx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:31:22
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Controller
public class GuestController {
    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest>guestList=guestService.list();
        model.addAttribute("guestlist",guestList);
        return "list";
    }
    @RequestMapping("/guest/toadd")
    public String toadd(){

        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);

        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toupdate")
    public String toupdate(Model model,String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        guestService.delete(name);
        return "redirect:/guest/list";

    }
}

package com.wllx.controller;

import com.wllx.bean.Guest;
import com.wllx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:31:22
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model){
        List<Guest>guestList=guestService.list();
        model.addAttribute("guestlist",guestList);
        return "list";
    }
    @GetMapping("/toadd")
    public String toadd(){
        return "add";
    }

//    @Transactional
    @PostMapping
    public String add(Guest guest){
        guestService.save(guest);
//        int res= 1/0;
        return "redirect:/guest";

    }

}

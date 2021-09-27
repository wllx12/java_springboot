package com.wllx.controller;

import com.wllx.bean.Guest;
import com.wllx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
public class GustController {
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

    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toupdate/{name}")
    public String toupdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";

    }
}

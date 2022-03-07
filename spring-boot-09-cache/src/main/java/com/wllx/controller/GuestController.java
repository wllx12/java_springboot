package com.wllx.controller;

import com.wllx.bean.Guest;
import com.wllx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/09/25 12:31:22
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@RestController
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> list(Model model){
        List<Guest> guestList=guestService.list();
        return guestList;
    }


    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable(name = "id") int id){
        Guest guest=guestService.getGuestById(id);
        return guest;
    }

    @GetMapping("/update")
    public Guest updateGuest(Integer id,String name,String role){
        Guest newGuest=new Guest(id,name,role);
        guestService.updateGuest(newGuest);
        return newGuest;
    }
    @GetMapping("/delete/{id}")
    public String delGuest(@PathVariable(name = "id") int id){
        guestService.deleteGuest(id);

        return "success";
    }

    @GetMapping("/delall")
    public String delAllGuest(){
        guestService.deleteAllGuest();

        return "success";
    }

}

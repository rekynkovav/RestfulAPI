package com.example.RestfulAPI.controller;

import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.facade.ItemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/RestfulAPI")
public class ItemController {

    @Autowired
    public void setItemFacade(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    ItemFacade itemFacade;

    @GetMapping("/simple-form")
    public String showItem(){
/// /// 1:20
        return "simple-form";
    }

    @PostMapping("/form")
    public String saveItem(@RequestParam(value = "title") String title){
        System.out.println(title);
        ItemDTO itemDTO = new ItemDTO(title);
        itemFacade.saveDTO(itemDTO);
        return "redirect:/simple-form";
    }
}

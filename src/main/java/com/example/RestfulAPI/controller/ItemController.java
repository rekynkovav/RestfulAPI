package com.example.RestfulAPI.controller;

import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.facade.ItemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    @Autowired
    public void setItemFacade(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    ItemFacade itemFacade;



    @GetMapping("/item")
    public String showItem(){
        return "/item";
    }

    public String saveItem(@RequestParam(value = "title") String title){
        ItemDTO itemDTO = new ItemDTO(title);
        itemFacade.setDTO(itemDTO);
        return "redirect:/item";
    }
}

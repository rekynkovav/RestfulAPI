package com.example.RestfulAPI.controller;

import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.facade.ItemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/RestfulAPI")
public class ItemController {

    @Autowired
    public void setItemFacade(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    ItemFacade itemFacade;

    @GetMapping("/addItem")
    public String AddItem(Model model){
        ItemDTO itemDTO = new ItemDTO("null");
        model.addAttribute("itemDTO", itemDTO);
        return "item-form";
    }

    @PostMapping("/form")
    public String saveItem(@ModelAttribute(value = "title") ItemDTO itemDTO){
        itemFacade.saveDTO(itemDTO);

        return "redirect:/addItem";
    }
}

package com.example.RestfulAPI.controller;

import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.facade.ItemFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/RestfulAPI")
public class ItemController {

    ItemFacade itemFacade;

    @Autowired
    public void setItemFacade(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    @GetMapping("/addItem")
    public String AddItem(Model model){
        model.addAttribute("items", itemFacade.getAllItem());
        ItemDTO itemDTO = new ItemDTO();
        model.addAttribute("itemDTO", itemDTO);
        return "item-form";
    }

    @PostMapping("/save")
    public String saveItem(@ModelAttribute(value = "title") ItemDTO itemDTO){
        itemFacade.saveDTO(itemDTO);
        return "redirect:/addItem";
    }

    @PostMapping("/delete")
    public String deleteItem(@ModelAttribute(value = "id") ItemDTO itemDTO){
        System.out.println(itemDTO.getId());
        itemFacade.deleteDTO(itemDTO.getId());
        return "redirect:/addItem";
    }
}

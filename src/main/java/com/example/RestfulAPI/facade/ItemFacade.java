package com.example.RestfulAPI.facade;


import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.entity.Item;
import com.example.RestfulAPI.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFacade {

    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public void saveDTO(ItemDTO itemDTO){
        saveItem(itemDTO);
    }

    private void saveItem(ItemDTO itemDTO) {
        itemService.save(new Item(itemDTO.getTitle()));
    }
}

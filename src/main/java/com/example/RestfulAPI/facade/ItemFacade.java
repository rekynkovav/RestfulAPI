package com.example.RestfulAPI.facade;


import com.example.RestfulAPI.dto.ItemDTO;
import com.example.RestfulAPI.entity.Item;
import com.example.RestfulAPI.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemFacade {

    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public void saveDTO(ItemDTO itemDTO){
        mapperEntity(itemDTO);
    }

    private void mapperEntity(ItemDTO itemDTO) {
        itemService.save(new Item(itemDTO.getTitle()));
    }

    public List<Item> getAllItem(){
       return itemService.getAllItem();
    }

    public void deleteDTO(long id){
        itemService.delete(id);
    }
}

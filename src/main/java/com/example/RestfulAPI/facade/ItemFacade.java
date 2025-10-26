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

    public void setDTO(ItemDTO itemDTO){
        Item item = new Item();
        item.setTitle(itemDTO.getTitle());
        itemService.save(item);
    }

    public ItemDTO getDTO(Item item){
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setTitle(item.getTitle());
        return itemDTO;
    }


    // тут беру запрос от контроллера и DTO, преобразую в
// ентити кладу в БД, так же беру из бд преобразую в ентити и отдаю контроллеру


}

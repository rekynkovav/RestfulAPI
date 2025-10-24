package com.example.RestfulAPI.service;

import com.example.RestfulAPI.entity.Item;
import com.example.RestfulAPI.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    public void setItemIRepository(ItemRepository itemIRepository) {
        this.itemIRepository = itemIRepository;
    }

    private ItemRepository itemIRepository;

    public List<Item> getAllItems(){
        return itemIRepository.findAll();
    }
}

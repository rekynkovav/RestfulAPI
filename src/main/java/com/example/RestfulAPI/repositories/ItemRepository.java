package com.example.RestfulAPI.repositories;

import com.example.RestfulAPI.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}

package com.example.RestfulAPI.repositories;

import com.example.RestfulAPI.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemIRepository  extends JpaRepository<Item,Long> {
}

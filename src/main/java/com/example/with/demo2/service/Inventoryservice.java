package com.example.with.demo2.service;

import com.example.with.demo2.dto.OrderRequest;
import com.example.with.demo2.entity.Inventory;
import org.springframework.stereotype.Service;

@Service
public interface Inventoryservice {

    Inventory createInventory(Inventory inventory);

    Inventory getInventoryByid(Integer id);

    Boolean inStock(OrderRequest request);
}

package com.example.with.demo2.controller;


import com.example.with.demo2.dto.OrderRequest;
import com.example.with.demo2.entity.Inventory;
import com.example.with.demo2.service.Inventoryservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory")

public class Inventorycontroller {

    private final Inventoryservice inventoryservice;


    @PostMapping("/create")
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryservice.createInventory(inventory);
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable Integer id) {

        return inventoryservice.getInventoryByid(id);
    }


    @PutMapping("/inStock")
    public Boolean InStock(@RequestBody OrderRequest request) {
        return inventoryservice.inStock(request);
    }









}

package com.example.with.demo2.service;

import com.example.with.demo2.dto.OrderRequest;
import com.example.with.demo2.entity.Inventory;
import com.example.with.demo2.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor


public class InventoryserviceImpl implements Inventoryservice{


 private final InventoryRepository inventoryRepository;


    @Override
    public Inventory createInventory(Inventory inventory) {

            Inventory inv = new Inventory();
            inv.setProduct(inventory.getProduct());
            inv.setStock(inventory.getStock());

            return inventoryRepository.save(inventory);


    }

    @Override
    public Inventory getInventoryByid(Integer id) {
Inventory inventory1 = inventoryRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Inventory not found"));
return inventory1;

    }

    @Override
    public Boolean inStock(OrderRequest request) {

        Optional<Inventory> inv = inventoryRepository.findById(request.getId());

        if (inv.isPresent()) {
            if (inv.get().getStock() < request.getQuantity()) {
                return false;
            }
            else {
                inv.get().setStock(inv.get().getStock() - request.getQuantity());
                inventoryRepository.save(inv.get());
                return true;
            }
        }
        return false;
    }


}

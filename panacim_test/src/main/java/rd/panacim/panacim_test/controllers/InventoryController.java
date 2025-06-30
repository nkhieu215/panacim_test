package rd.panacim.panacim_test.controllers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.services.DTO.InventoryDTO;
import rd.panacim.panacim_test.services.DTO.InventoryResponse;
import rd.panacim.panacim_test.services.InventoryService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("inventory")
public class InventoryController {
        @Autowired
        InventoryService inventoryService;
        @GetMapping("")
        public List<InventoryResponse>getInventories(){
                return  this.inventoryService.getInventories();
        }
        @PostMapping("/update")
        public ResponseEntity<?> updateInventory(@RequestBody List<InventoryDTO> request) {
                try {
                        boolean isUpdated = inventoryService.updateInventory(request);

                        if (isUpdated) {
                                return ResponseEntity.ok("Inventory updated successfully.");
                        } else {
                                return ResponseEntity.status(404).body("No inventory data found.");
                        }
                } catch (Exception e) {
                        return ResponseEntity.status(500).body("Error updating inventory:: " + e.getMessage());
                }
        }
}

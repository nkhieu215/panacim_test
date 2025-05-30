package rd.panacim.panacim_test.controllers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.services.InventoryService;

import java.util.Date;
import java.util.List;

@Controller
public class InventoryController {
        @Autowired
        InventoryService inventoryService;
        @QueryMapping
        public List<Inventory> getAllInventory(){
                return this.inventoryService.getAll();
        }
}

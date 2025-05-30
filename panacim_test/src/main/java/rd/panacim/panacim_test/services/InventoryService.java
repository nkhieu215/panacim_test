package rd.panacim.panacim_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.repository.InventoryRepository;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;
    public List<Inventory> getAll(){
        return  this.inventoryRepository.findAll();
    }
}

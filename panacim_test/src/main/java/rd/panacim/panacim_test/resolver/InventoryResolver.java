package rd.panacim.panacim_test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.services.InventoryService;

import java.util.List;
@Controller
public class InventoryResolver {
    @Autowired
    InventoryService inventoryService;
    @QueryMapping
    public List<Inventory> getAllInventory(){
        System.out.println(("check ham running :::: "));
        return this.inventoryService.getAll();
    }
}

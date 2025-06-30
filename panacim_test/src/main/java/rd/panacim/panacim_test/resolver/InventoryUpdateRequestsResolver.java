package rd.panacim.panacim_test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rd.panacim.panacim_test.models.InventoryUpdateRequests;
import rd.panacim.panacim_test.services.InventoryUpdateRequestsService;

import java.util.List;

@Controller
public class InventoryUpdateRequestsResolver {
    @Autowired
    InventoryUpdateRequestsService inventoryUpdateRequestsService;
    @QueryMapping
    public List<InventoryUpdateRequests> getAllInventoryUpdateRequests (){
        return this.inventoryUpdateRequestsService.getAll();
    }
}

package rd.panacim.panacim_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsDetail;
import rd.panacim.panacim_test.services.InventoryUpdateRequestsDetailService;

import java.util.List;

@RestController
@RequestMapping("/request/detail")
public class InventoryUpdateRequestsDetailController {
    @Autowired
    InventoryUpdateRequestsDetailService inventoryUpdateRequestsDetailService;
    @GetMapping("/{id}")
    public List<InventoryUpdateRequestsDetail> getDetail(@PathVariable Long id){
        return this.inventoryUpdateRequestsDetailService.getByRequestId(id);
    }
}

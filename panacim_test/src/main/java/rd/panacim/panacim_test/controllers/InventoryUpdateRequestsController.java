package rd.panacim.panacim_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rd.panacim.panacim_test.models.InventoryUpdateRequests;
import rd.panacim.panacim_test.services.DTO.RequestDTO;
import rd.panacim.panacim_test.services.InventoryUpdateRequestsService;

import java.util.List;

@RestController
@RequestMapping("request")
public class InventoryUpdateRequestsController {
    @Autowired
    InventoryUpdateRequestsService inventoryUpdateRequestsService;

    @PostMapping("")
    public void updateInSert(@RequestBody RequestDTO requestDTO) {
        this.inventoryUpdateRequestsService. updateInfo(requestDTO);
    }
    @GetMapping("")
    public List<InventoryUpdateRequests> getAll(){
        return this.inventoryUpdateRequestsService.getAll();
    }
}

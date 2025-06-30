package rd.panacim.panacim_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsHistory;
import rd.panacim.panacim_test.services.DTO.TimeRangeDTO;
import rd.panacim.panacim_test.services.InventoryUpdateRequestsHistoryService;

import java.util.List;

@RequestMapping("/request/history")
@RestController
public class InventoryUpdateRequestsHistoryController {
    @Autowired
    InventoryUpdateRequestsHistoryService inventoryUpdateRequestsHistoryService;
    @PostMapping()
    public List<InventoryUpdateRequestsHistory> getAllByDateRange(@RequestBody TimeRangeDTO timeRangeDTO){
        return this.inventoryUpdateRequestsHistoryService.getAllByRange(timeRangeDTO);
    }
    @GetMapping("/{requestCode}")
    public List<InventoryUpdateRequestsHistory> findAllByRequestCode(@PathVariable String requestCode){
        return this.inventoryUpdateRequestsHistoryService.findAllByRequestCode(requestCode);
    }
}

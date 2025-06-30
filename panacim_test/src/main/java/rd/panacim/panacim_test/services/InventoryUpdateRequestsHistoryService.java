package rd.panacim.panacim_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsHistory;
import rd.panacim.panacim_test.repository.InventoryUpdateRequestsHistoryRepository;
import rd.panacim.panacim_test.services.DTO.TimeRangeDTO;

import java.util.List;

@Service
public class InventoryUpdateRequestsHistoryService {
    @Autowired
    InventoryUpdateRequestsHistoryRepository inventoryUpdateRequestsHistoryRepository;
    public List<InventoryUpdateRequestsHistory> getAllByRange(TimeRangeDTO timeRangeDTO){
        return  this.inventoryUpdateRequestsHistoryRepository.getByRequestedTimeRange(timeRangeDTO.getStartTime(), timeRangeDTO.getEndTime());
    }
    public List<InventoryUpdateRequestsHistory> findAllByRequestCode(String requestCode){
        return this.inventoryUpdateRequestsHistoryRepository.findAllByRequestCode(requestCode);
    }
}

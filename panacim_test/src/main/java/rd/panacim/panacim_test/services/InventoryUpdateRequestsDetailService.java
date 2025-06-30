package rd.panacim.panacim_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsDetail;
import rd.panacim.panacim_test.repository.InventoryUpdateRequestsDetailRepository;

import java.util.List;

@Service
public class InventoryUpdateRequestsDetailService {
@Autowired
    InventoryUpdateRequestsDetailRepository inventoryUpdateRequestsDetailRepository;
    public List<InventoryUpdateRequestsDetail> getByRequestId(Long id){
        return this.inventoryUpdateRequestsDetailRepository.findAllByRequestId(id);
    }

}

package rd.panacim.panacim_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsDetail;

import java.util.List;

public interface InventoryUpdateRequestsDetailRepository extends JpaRepository<InventoryUpdateRequestsDetail,Long> {
    public List<InventoryUpdateRequestsDetail> findAllByRequestId(Long id);
}

package rd.panacim.panacim_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rd.panacim.panacim_test.models.InventoryUpdateRequests;

public interface InventoryUpdateRequestsRepository extends JpaRepository<InventoryUpdateRequests,Long> {
}

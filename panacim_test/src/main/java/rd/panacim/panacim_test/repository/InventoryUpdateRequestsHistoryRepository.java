package rd.panacim.panacim_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsHistory;

import java.util.List;

@Repository
public interface InventoryUpdateRequestsHistoryRepository extends JpaRepository<InventoryUpdateRequestsHistory,Long> {
    @Query(value = "select * from inventory_update_requests_history where " +
            " requested_time between ?1 and ?2 ;",nativeQuery = true)
    public List<InventoryUpdateRequestsHistory> getByRequestedTimeRange(String startTime,String endTime);
    public List<InventoryUpdateRequestsHistory> findAllByRequestCode(String requestCode);
}

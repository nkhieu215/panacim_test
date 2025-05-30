package rd.panacim.panacim_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rd.panacim.panacim_test.models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}

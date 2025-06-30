package rd.panacim.panacim_test.resolver;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.services.LocationService;

@Component
public class InventoryFieldResolver {
    private final LocationService locationService;

    public InventoryFieldResolver(LocationService locationService) {
        this.locationService = locationService;
    }

    @SchemaMapping(typeName = "Inventory", field = "locationName")
    public String resolveLocationName(Inventory inventory) {
        return locationService.getLocationNameById(inventory.getLocationId());
    }
}

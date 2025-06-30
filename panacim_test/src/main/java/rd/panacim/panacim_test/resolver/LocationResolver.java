package rd.panacim.panacim_test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rd.panacim.panacim_test.models.Location;
import rd.panacim.panacim_test.services.LocationService;

import java.util.List;
@Controller
public class LocationResolver {
    @Autowired
    LocationService locationService;
    @QueryMapping
    public List<Location> allLocations(){
        return this.locationService.getAll();
    }
}

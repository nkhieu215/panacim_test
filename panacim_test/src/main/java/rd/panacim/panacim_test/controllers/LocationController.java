package rd.panacim.panacim_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rd.panacim.panacim_test.models.Location;
import rd.panacim.panacim_test.repository.LocationRepository;
import rd.panacim.panacim_test.services.LocationService;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;
    @GetMapping()
    public List<Location> getAll(){
        return  this.locationService.getAll();
    }
}

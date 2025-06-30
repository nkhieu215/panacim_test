package rd.panacim.panacim_test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rd.panacim.panacim_test.models.Inventory;
import rd.panacim.panacim_test.models.Location;
import rd.panacim.panacim_test.repository.LocationRepository;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;
    public List<Location> getAll(){
        return this.locationRepository.getFullLocation();
    }

    public String getLocationNameById(Long locationId) {
        System.out.println(("check functions. running :::: "));
        return locationRepository.findById(locationId)
                .map(Location::getLocationName)
                .orElse(null);
    }

}

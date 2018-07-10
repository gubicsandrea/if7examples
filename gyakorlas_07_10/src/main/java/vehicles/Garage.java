package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void newVehicle(Vehicle vehicle){
        if (vehicle == null) {
            throw new IllegalArgumentException("Eznemjóígy");
        }
        vehicles.add(vehicle);
    }

}

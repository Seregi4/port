import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PortWarehouseService implements UnloadingLoadingContainers {
    @Override
    public void loadingContainers() {
        Ship ship = new Ship();
        PortWarehouse warehouse = new PortWarehouse();
        if (getFreeWarehouseVolume(warehouse) >= ship.getContainers().size()) {
            warehouse.setContainers(List.copyOf(ship.getContainers()));
            ship.setContainers(Collections.emptyList());
        }
    }

    @Override
    public void unloadContainers() {
        Ship ship = new Ship();
        PortWarehouse warehouse = new PortWarehouse();


    }

    private int getFreeWarehouseVolume(PortWarehouse warehouse) {
        return PortWarehouse.getMaxVolume() - warehouse.getContainers().size();
    }
}

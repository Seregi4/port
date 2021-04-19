public class PortService {
    PortWarehouse warehouse;
    Ship ship;

    public PortService(PortWarehouse warehouse, Ship ship) {
        this.warehouse = warehouse;
        this.ship = ship;
    }

    public void loadContainersToWarehouse(int count){
        warehouse.setWarehouseContainer(warehouse.getWarehouseContainer()+count);
        ship.setShipContainers(ship.getShipContainers()-count);
    }
    public void unLoadContainersInWarehouse(){

    }
}

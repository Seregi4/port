//public class PortService {
//    PortWarehouse warehouse;
//    Ship ship;
//
//    public PortService(PortWarehouse warehouse, Ship ship) {
//        this.warehouse = warehouse;
//        this.ship = ship;
//    }

//    public void loadContainersToWarehouse(PortWarehouse warehouse, Ship ship, int count) {
//        if ((PortWarehouse.getMaxContainerValue() - warehouse.getWarehouseContainer() >= count)) {
//            warehouse.setWarehouseContainer(warehouse.getWarehouseContainer() + count);
//            ship.setShipContainers(ship.getShipContainers() - count);
//        } else {
//            System.out.println("No free space");
//        }
//
//    }
//
//    public void unLoadContainersInWarehouse(PortWarehouse warehouse, Ship ship, int count) {
//        System.out.println("Warehouse current space " + warehouse.getWarehouseContainer());
//
//        if (Ship.getMaxShipContainerValue() - ship.getShipContainers() >= count) {
//            ship.setShipContainers(ship.getShipContainers() + count);
//            warehouse.setWarehouseContainer(warehouse.getWarehouseContainer() - count);
//        } else {
//            System.out.println("No free space");
//        }
//        System.out.println("Warehouse current space " + warehouse.getWarehouseContainer());
//
//    }
//
//    public void TransferringContainersFromShipToShip(Ship ship1, Ship ship2) {
//        System.out.println("ship1 current space " + ship1.getShipContainers());
//        System.out.println("ship2 current space " + ship2.getShipContainers());
//
//        if (Ship.getMaxShipContainerValue() - ship2.getShipContainers() >= ship1.getShipContainers()) {
//            ship2.setShipContainers(ship2.getShipContainers() + ship1.getShipContainers());
//            ship1.setShipContainers(ship1.getShipContainers() - ship1.getShipContainers());
//        } else {
//            System.out.println("No free space");
//        }
//        System.out.println("ship1 current space " + ship1.getShipContainers());
//        System.out.println("ship2 current space " + ship2.getShipContainers());
//
//    }
//

//}

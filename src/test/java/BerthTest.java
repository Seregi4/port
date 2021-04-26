import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerthTest {

    @Test
    public void shipLoadInWarehoused() throws InterruptedException {
        Berth berth = new Berth();
        Ship ship = new Ship();
//        System.out.println(" all "+ ship.getShipContainersCount());
//        System.out.println("to load "+ ship.getContainersToLoad());
//        System.out.println(" to unload " +ship.getContainersToUnLoad());
        PortWarehouse warehouse = new PortWarehouse();
        berth.shipLoadInWarehoused(ship, warehouse);

        int shipResult = ship.getShipContainersCount();
        int shipExpected = ship.getShipContainersCount() + ship.getContainersToLoad();
        int warResult = warehouse.getWarehouseContainer();
        int warExpected = warehouse.getWarehouseContainer() - ship.getContainersToLoad();
        assertEquals(shipExpected, shipResult);
        assertEquals(warExpected, warResult);
    }

    @Test
    public void shipUnloadToWarehoused() throws InterruptedException {
        Berth berth = new Berth();
        Ship ship = new Ship();
//        System.out.println(" all " + ship.getShipContainersCount());
//        System.out.println("to load " + ship.getContainersToLoad());
//        System.out.println(" to unload " + ship.getContainersToUnLoad());
//        System.out.println(" to unload to ship "+ ship.getContainersToUNLoadToShip());

        PortWarehouse warehouse = new PortWarehouse();
        //   System.out.println(" warhcont "+ warehouse.getWarehouseContainer());
        berth.shipUnloadToWarehoused(ship, warehouse);

        int shipResult = ship.getShipContainersCount();
        int shipExpected = ship.getShipContainersCount() - ship.getContainersToUnLoad();

        int warResult = warehouse.getWarehouseContainer();
        int warExpected = warehouse.getWarehouseContainer() + ship.getContainersToUnLoad();
        assertEquals(shipExpected, shipResult);
        assertEquals(warExpected, warResult);

    }
}
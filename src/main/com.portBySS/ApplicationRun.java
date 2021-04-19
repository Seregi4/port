import java.util.ArrayList;
//. Корабли заходят в порт для разгрузки или загрузки контейнеров и швартуются к причалам.
// У каждого причала может стоять только один корабль.
// Контейнеры перегружаются с корабля на корабль или на склад порта.
// Число контейнеров не может превышать емкость склада или корабля.
public class ApplicationRun {
    public static void main(String[] args) throws Exception {

        PortWarehouse warehouse = new PortWarehouse(20);

        ArrayList<Berth> portBerth = new ArrayList<>();

        Berth berth1 = new Berth();
        Berth berth2 = new Berth();

        portBerth.add(berth1);
        portBerth.add(berth2);


        Port port = new Port(portBerth, warehouse);

        Ship ship1 = new Ship(1,5);
        Ship ship2 = new Ship(2,14);
        Ship ship3 = new Ship(3,15);
        Ship ship4 = new Ship(4,7);
        Ship ship5 = new Ship(5,20);

        System.out.println(ship2.getShipContainers());
        System.out.println(warehouse.getWarehouseContainer());
        PortService portService = new PortService(warehouse,ship2);
        portService.loadContainersToWarehouse(6);
        System.out.println(ship2.getShipContainers());
        System.out.println(warehouse.getWarehouseContainer());

    }
}

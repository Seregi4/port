import java.util.ArrayList;
import java.util.concurrent.*;
//. Корабли заходят в порт для разгрузки или загрузки контейнеров и швартуются к причалам.
// У каждого причала может стоять только один корабль.
// Контейнеры перегружаются с корабля на корабль или на склад порта.
// Число контейнеров не может превышать емкость склада или корабля.
//Executer;
public class ApplicationRun {
    public static void main(String[] args) throws InterruptedException {

        PortWarehouse warehouse = new PortWarehouse(20);

        ArrayList<Berth> portBerth = new ArrayList<>();

        Berth berth1 = new Berth(warehouse);
        Berth berth2 = new Berth(warehouse);

        portBerth.add(berth1);
        portBerth.add(berth2);


        Port port = new Port(portBerth);

        Ship ship1 = new Ship(1,5,port);
        Ship ship2 = new Ship(2,14,port);
        Ship ship3 = new Ship(3,15,port);
        Ship ship4 = new Ship(4,7,port);
        Ship ship5 = new Ship(5,20,port);

       // System.out.println(ship2.getShipContainers());
     //   System.out.println(warehouse.getWarehouseContainer());
     //   PortService portService = new PortService();
       // portService.loadContainersToWarehouse(warehouse,ship2,5);
      //  System.out.println("new");
      //  portService.unLoadContainersInWarehouse(warehouse,ship4,6);
       // portService.TransferringContainersFromShipToShip(ship3,ship1);

        Thread thread1 = new Thread(ship1);
        Thread thread2 = new Thread(ship2);
        Thread thread3 = new Thread(ship3);
        Thread thread4 = new Thread(ship4);

        thread1.start();

        thread2.start();

        thread3.start();
        thread3.join();
        thread4.start();
        thread4.join();


    }
}

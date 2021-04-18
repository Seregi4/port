import java.util.*;

public class ApplicationRun {
    //Порт. Корабли заходят в порт для разгрузки или загрузки контейнеров и
    //швартуются к причалам. У каждого причала может стоять только один
    //корабль. Контейнеры перегружаются с корабля на корабль или на склад
    //порта. Число контейнеров не может превышать емкость склада или
    //корабля.
    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();
        Container container4 = new Container();
        Container container5 = new Container();
        List<Container>containers= new ArrayList<>();
          containers.add(container5);
          containers.add(container4);
          containers.add(container3);
          containers.add(container2);
          containers.add(container1);
Ship ship = new Ship();
Port port = new Port();
ship.setContainers(containers);
        System.out.println(ship);

   PortWarehouseService warehouseService = new PortWarehouseService();
   warehouseService.loadingContainers();
    }
   }

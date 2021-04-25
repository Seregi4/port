import org.apache.log4j.Logger;

public class Berth implements Runnable {
    private static final Logger log = Logger.getLogger(Berth.class);
    Ship ship = null;                   //Переменная хранящая корабль, она будет переписываться после каждого цикла
    PortWarehouse warehouse = new PortWarehouse();

    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " ready");


        try {

            while (true) {
                ship = Port.queue.take();             //Присваивание переменной ship элемента из очереди кораблей
                if (ship.getContainersToUnLoad() != 0) {    //Условие груза связанное с грузом коробля для разгрузки
                    if ((warehouse.getWarehouseContainer() + ship.getContainersToUnLoad()) < PortWarehouse.MAX_CONTAINER_VALUE) {
                        shipUnloadToWarehoused();
                    } else {
                        Thread.sleep(3000);
                    }

                }
                if (ship.getContainersToLoad() != 0) {     //Условие груза связанное с грузом коробля для загрузки
                    if (ship.getShipContainersCount() + ship.getContainersToLoad() < Ship.MAX_SHIP_CONTAINER_VALUE) {
                        shipLoadInWarehoused();
                    } else {
                        Thread.sleep(3000);
                    }
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void shipLoadInWarehoused() throws InterruptedException {
        ship.setShipContainersCount(ship.getShipContainersCount() + ship.getContainersToLoad());
        warehouse.setWarehouseContainer(warehouse.getWarehouseContainer() - ship.getContainersToLoad());
        log.info(Thread.currentThread().getName() + " Началась загрузка ship" + ship.getShipID() + " cargo " + ship.getContainersToLoad());

        ship.setContainersToLoad(0);

        //соответственно разгрузка
        Thread.sleep(1000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("на складе осталось" + warehouse.getWarehouseContainer() + " контейнеров");
        System.out.println("Корабль" + ship.getShipID() + " загружен ");

    }

    private void shipUnloadToWarehoused() throws InterruptedException {
        warehouse.setWarehouseContainer(warehouse.getWarehouseContainer() + ship.getContainersToUnLoad());
        log.info(Thread.currentThread().getName() + " Началась разгруска на склад " + " Ship" + ship.getShipID() + " cargo " + ship.getContainersToUnLoad());
        System.out.println();
        ship.setContainersToUnLoad(0);
        //Ожидание 1 сек


        Thread.sleep(1000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("на складе осталось " + warehouse.getWarehouseContainer() + " контейнеров");
        System.out.println("Корабль" + ship.getShipID() + " Разгружен ");

    }

}

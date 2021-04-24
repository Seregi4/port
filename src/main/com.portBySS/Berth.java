public class Berth implements Runnable{

    Ship ship = null;                   //Переменная хранящая корабль, она будет переписываться после каждого цикла
    PortWarehouse warehouse = new PortWarehouse();
    @Override
    public void run() {

        System.out.println("Berths " + Thread.currentThread().getName() + " ready");

        try {

            while (true) {
                ship = Port.queue.take();             //Присваивание переменной ship элемента из очереди кораблей
                if (ship.getContainersToUnLoad()!=0){    //Условие груза связанное с грузом коробля
                    warehouse.setWarehouseContainer(warehouse.getWarehouseContainer()+ship.getContainersToUnLoad());
                    ship.setContainersToUnLoad(ship.getContainersToUNLoadToShip()-ship.getContainersToUnLoad());
                    Thread.sleep(100);         //Ожидание 1 сек

                    System.out.println(Thread.currentThread().getName() + " Началась разгруска на склад " +" Ship "+ ship.getShipID());
                    System.out.println("на складе " + warehouse.getWarehouseContainer()+ " контэйнеров"); //Добавление контейнеров на склад с корабля

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Корабль " + ship.getShipID() + " Разгружен ");

//                } else {                             //Условие противоположное выше стоящему
//
//                    Thread.sleep(10);
//                    System.out.println(Thread.currentThread().getName() + " Началась разгрузка " + ship);
//                    ship.cargo -= 25;                //соответственно разгрузка
//
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    System.out.println("Корабль " + ship + " разгружен ");
            }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

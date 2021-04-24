
class MoveShips extends Thread {     //Поток движение

    @Override
    public void run() {

        while (true) {

            Ship ship = new Ship();          //Создание объекта ship

            try {
                if (Port.queue.size() == 10) {   //Информирование о заполнении очереди

                    System.out.println("""

                            Слишком много кораблей, порт приостановил прием
                            """);
                    sleep(100);

                } else {

                    Port.queue.put(ship);       //Добавление корабля в очередь
                    System.out.println("Корабль " + ship.getShipID() + " прибыл в порт c " + ship.getShipContainersCount()+ " cargo");
                    System.out.println("Ждут свободного дока " + Port.queue.size() + " кораблей");

                    try {
                        sleep(90);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        }
    }
}

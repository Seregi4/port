import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    private PortWarehouse warehouse;
    static BlockingQueue<Ship> queue = new ArrayBlockingQueue<Ship>(10);    // Сюда поступают корабли


    public Port() {

        ExecutorService berths = Executors.newFixedThreadPool(3);    // Пулл потоков

        for (int i = 0; i < 3; i++) {                                      //3 задания Dock
            berths.submit(new Berth());                                       //Старт 3 потоков
        }
        // berths.submit(new MoveShips());                                       //задание MoveShips
      MoveShips moveShips = new MoveShips();
        moveShips.start();
        berths.shutdown();
    }







}

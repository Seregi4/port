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

        for (int i = 0; i < 3; i++) {
            berths.submit(new Berth());
        }
        // berths.submit(new MoveShips());
      MoveShips moveShips = new MoveShips();
        moveShips.start();
        berths.shutdown();
    }







}

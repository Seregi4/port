
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {

    static BlockingQueue<Ship> queue = new ArrayBlockingQueue<>(10);    // Сюда поступают корабли
    PortWarehouse warehouse = new PortWarehouse();

    public PortWarehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(PortWarehouse warehouse) {
        this.warehouse = warehouse;
    }

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

import java.util.ArrayList;

public class Port {
    private ArrayList<Berth> berths;

    private PortWarehouse warehouse;

    public Port() {
        super();
    }

    public Port(ArrayList<Berth> berths, PortWarehouse warehouse) {
        this.berths = berths;

        this.warehouse = warehouse;
    }

    public ArrayList<Berth> getBerths() {
        return berths;
    }

    public void setBerths(ArrayList<Berth> berths) {
        this.berths = berths;
    }

    public PortWarehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(PortWarehouse warehouse) {
        this.warehouse = warehouse;
    }
}

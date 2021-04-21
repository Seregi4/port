public class Berth {
    private boolean isEmpty;
   private PortWarehouse warehouse;
    public Berth(PortWarehouse warehouse) {
        this.isEmpty = true;
        this.warehouse=warehouse;


    }

    public Berth() {
        super();
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

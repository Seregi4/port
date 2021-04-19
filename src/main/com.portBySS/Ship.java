public class Ship {
    public static final int MAX_SHIP_CONTAINER_VALUE = 20;
    private int shipID;
    private int shipContainers;

    public Ship() {
        super();
    }

    public Ship(int shipID, int shipContainers) {
        this.shipID = shipID;
        this.shipContainers = shipContainers;
    }


    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public int getShipContainers() {
        return shipContainers;
    }

    public void setShipContainers(int shipContainers) {
        this.shipContainers = shipContainers;
    }
}

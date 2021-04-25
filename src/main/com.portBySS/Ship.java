public class Ship  {
    static int idCount = 0;
    public static final int MAX_SHIP_CONTAINER_VALUE = 30;
    private int shipID;
    private Port port;

    private int containersToLoad;
    private int containersToUnLoad;
    private int containersToUNLoadToShip;
    private int shipContainersCount;




    public Ship() {

        {
            this.shipID = idCount;
            idCount++;
        }

        this.containersToLoad = (int) (Math.random() * 10);
        this.containersToUnLoad = (int) (Math.random() * 10);
        this.containersToUNLoadToShip = (int) (Math.random()*10);
        this.shipContainersCount=containersToUnLoad + containersToUNLoadToShip;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Ship.idCount = idCount;
    }

    public static int getMaxShipContainerValue() {
        return MAX_SHIP_CONTAINER_VALUE;
    }

    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public int getContainersToLoad() {
        return containersToLoad;
    }

    public void setContainersToLoad(int containersToLoad) {
        this.containersToLoad = containersToLoad;
    }

    public int getContainersToUnLoad() {
        return containersToUnLoad;
    }

    public void setContainersToUnLoad(int containersToUnLoad) {
        this.containersToUnLoad = containersToUnLoad;
    }

    public int getContainersToUNLoadToShip() {
        return containersToUNLoadToShip;
    }

    public void setContainersToUNLoadToShip(int containersToUNLoadToShip) {
        this.containersToUNLoadToShip = containersToUNLoadToShip;
    }

    public int getShipContainersCount() {
        return shipContainersCount;
    }

    public void setShipContainersCount(int shipContainersCount) {
        this.shipContainersCount = shipContainersCount;
    }
}

public class Ship implements Runnable{
    public static final int MAX_SHIP_CONTAINER_VALUE = 20;
    private int shipID;
    private int shipContainers;
    private Port port;

//    public Ship() {
//        super();
//    }

    public Ship(int shipID, int shipContainers, Port port) {
        this.shipID = shipID;
        this.shipContainers = shipContainers;
        this.port = port;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
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

    public int getShipContainers() {
        return shipContainers;
    }

    public void setShipContainers(int shipContainers) {
        this.shipContainers = shipContainers;
    }

    @Override
    public void run() {
        PortService service = new PortService();

        if(port.getBerths().get(0).isEmpty()){
            service.loadContainersToWarehouse(port.getBerths().get(1).getWarehouse(), this,4);
            port.getBerths().get(0).setEmpty(false);
        }
        else if(port.getBerths().get(1).isEmpty()){
            service.loadContainersToWarehouse(port.getBerths().get(2).getWarehouse(), this,4);
            port.getBerths().get(1).setEmpty(false);
        }
        else System.out.println("All warehouses no empty");
    }
}

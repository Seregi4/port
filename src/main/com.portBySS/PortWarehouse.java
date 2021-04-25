public class PortWarehouse {
    public static final int MAX_CONTAINER_VALUE = 500;
    private static int warehouseContainer = 295;

    public PortWarehouse() {
        super();
    }


    public int getWarehouseContainer() {
        return warehouseContainer;
    }

    public void setWarehouseContainer(int warehouseContainer) {
        this.warehouseContainer = warehouseContainer;
    }
}

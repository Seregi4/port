import java.util.ArrayList;

public class PortWarehouse {
    public static final int MAX_CONTAINER_VALUE = 50;
    private int warehouseContainer;

    public PortWarehouse() {
        super();
    }

    public PortWarehouse(int warehouseContainer) {
        this.warehouseContainer = warehouseContainer;
    }

    public static int getMaxContainerValue() {
        return MAX_CONTAINER_VALUE;
    }

    public int getWarehouseContainer() {
        return warehouseContainer;
    }

    public void setWarehouseContainer(int warehouseContainer) {
        this.warehouseContainer = warehouseContainer;
    }
}

import java.util.ArrayList;

public class PortWarehouse {
    public static final int MAX_CONTAINER_VALUE = 500;
    private static int warehouseContainer =250;

    public PortWarehouse() {
        super();
    }



  //  public static int getMaxContainerValue() {
   //     return MAX_CONTAINER_VALUE;
   // }

    public int getWarehouseContainer() {
        return warehouseContainer;
    }

    public void setWarehouseContainer(int warehouseContainer) {
        this.warehouseContainer = warehouseContainer;
    }
}

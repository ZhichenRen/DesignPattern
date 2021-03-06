package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseClient.java
 * @Description 仓库客户端
 * @createTime 2021年10月17日 13:26:00
 */
public class WarehouseClient {

    protected WarehouseDelegate warehouseService;

    public WarehouseClient(WarehouseDelegate warehouseService){
        this.warehouseService  = warehouseService;
    }

    public void doTask(){
        warehouseService.doTask();
    }

    public Boolean doTask(int radius, String color, Warehouse warehouse){
        return warehouseService.doTask(radius, color, warehouse);
    }
}

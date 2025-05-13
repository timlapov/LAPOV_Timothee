package art.lapov;

public class WharehouseService implements InventoryObserver{

    private final ActivityLogger activityLogger = ActivityLogger.getInstance();

    @Override
    public void update(Product product) {
        String message = "Service magasin notifié : " + product.getDescription();
        activityLogger.logActivity(message);
        System.out.println("NOTIFICATION !!! " + message);
    }
}

package art.lapov;

public class SalesService implements InventoryObserver {

    private final ActivityLogger logger = ActivityLogger.getInstance();

    @Override
    public void update(Product product) {
        String message = "Service des ventes notifié : " + product.getDescription();
        logger.logActivity(message);
        System.out.println("NOTIFICATION !!! " + message);
    }

}

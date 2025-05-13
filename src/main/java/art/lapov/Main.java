package art.lapov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ActivityLogger activityLogger = ActivityLogger.getInstance();

        Product productE1 = ProductFactory.createProduct("E1", "iPhone XS",   600, "électronique");
        Product productV1 = ProductFactory.createProduct("V1", "Bonnet",      10,  "vêtement");
        Product productA1 = ProductFactory.createProduct("A1", "Pain",        1,   "alimentaire");

        activityLogger.logActivity("Produit créé : " + productE1.getDescription());
        activityLogger.logActivity("Produit créé : " + productV1.getDescription());
        activityLogger.logActivity("Produit créé : " + productA1.getDescription());

        Inventory inventory = new Inventory();
        inventory.addObserver(new SalesService());
        inventory.addObserver(new WharehouseService());

        inventory.addProduct(productE1);
        inventory.addProduct(productV1);
        inventory.addProduct(productA1);

        System.out.println("\n-- Journal d'activités --");

        for (String entry : activityLogger.getActivityLog()) {
            System.out.println(entry);
        }
    }
}
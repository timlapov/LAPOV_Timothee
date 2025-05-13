package art.lapov;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Product> products = new ArrayList<>();
    private final ArrayList<InventoryObserver> observers = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        notifyObservers(product);
    }

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Product product) {
        for (InventoryObserver obs : observers) {
            obs.update(product);
        }
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(products);
    }

}

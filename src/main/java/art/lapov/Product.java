package art.lapov;

public abstract class Product {
    private final String id;
    private final String name;
    private final double price;
    private final String category;   // <-- теперь это строка

    protected Product(String id, String name, double price, String category) {
        this.id       = id;
        this.name     = name;
        this.price    = price;
        this.category = category;
    }

    public String  getId()       { return id; }
    public String  getName()     { return name; }
    public double  getPrice()    { return price; }
    public String  getCategory() { return category; }

    public String getDescription() {
        return "[" + id + "] " + name + ", " + price + " € (" + category + ")";
    }
}

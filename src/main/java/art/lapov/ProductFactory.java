package art.lapov;

public final class ProductFactory {
    private ProductFactory() { }

    public static Product createProduct(String id,
                                        String name,
                                        double price,
                                        String category) {

        String cat = category.trim().toLowerCase();

        switch (cat) {
            case "électronique":
                return new ElectronicsProduct(id, name, price);

            case "vêtement":
                return new ClothingProduct(id, name, price);

            case "alimentaire":
                return new FoodProduct(id, name, price);

            default:
                throw new IllegalArgumentException(
                        "Catégorie inconnue : " + category);
        }
    }

}

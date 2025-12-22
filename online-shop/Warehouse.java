import java.util.ArrayList;

public class Warehouse {
    private ArrayList<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, int price, int stock) {
        Product product = new Product(name, price, stock);
        this.products.add(product);
    }

    public int price(String name) {
        Product product = this.getProduct(name);

        if (product != null) {
            return product.getPrice();
        }

        return -99;
    }

    private Product getProduct(String name) {
        for (Product product : this.products) {
            String productName = product.getName();

            if (productName.equals(name)) {
                return product;
            }
        }

        return null;
    }

}

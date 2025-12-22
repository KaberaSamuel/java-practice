import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse {
    private ArrayList<Product> products;
    private HashMap<String, Integer> stockBalance;

    public Warehouse() {
        this.products = new ArrayList<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String name, int price, int stock) {
        Product product = new Product(name, price, stock);
        this.products.add(product);
        this.stockBalance.put(name, stock);
    }

    public int price(String productName) {
        Product product = this.getProduct(productName);

        if (product != null) {
            return product.getPrice();
        }

        return -99;
    }

    public int stock(String productName) {
        return this.stockBalance.getOrDefault(productName, 0);

    }

    public boolean take(String productName) {
        int stock = this.stockBalance.getOrDefault(productName, 0);

        if (stock > 0) {
            this.stockBalance.put(productName, stock - 1);
            return true;
        }

        return false;
    }

    public ArrayList<Product> products() {
        return this.products;
    }

    public Product getProduct(String productName) {
        for (Product product : this.products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }

        return null;
    }

}

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = this.items.get(product);

        if (item == null) {
            item = new Item(product, 1, price);
            this.items.put(product, item);
            return;
        }

        // item already present in card
        item.increaseQuantity();
    }

    public int price() {
        int total = 0;
        for (Item item : this.items.values()) {
            total += item.price();
        }

        return total;
    }

    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}

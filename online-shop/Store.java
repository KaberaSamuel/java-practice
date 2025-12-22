import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // handle the customers visits
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);

        System.out.println();
        System.out.println("our selection:");

        for (Product product : this.warehouse.products()) {
            String name = product.getName();
            int units = product.getStock();

            System.out.println(name + ", " + units + " units");
        }

        System.out.println();
        while (true) {
            System.out.print("What to put in the cart (empty line closes the prompt): ");
            String product = scanner.nextLine();

            if (product.isEmpty()) {
                break;
            }

            Product storeProduct = this.warehouse.getProduct(product);
            if (storeProduct == null) {
                System.out.println("Product not found in store");

                // move to next iteration
                continue;
            }

            // check if stock units are enough
            Boolean isTaken = this.warehouse.take(product);

            if (isTaken) {
                cart.add(storeProduct.getName(), storeProduct.getPrice());
            } else {
                System.out.println("No more units for " + product + " product in store");
            }

        }

        System.out.println();
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    static List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public static List<Product> getItems() {
        return items;
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        Inventory.displayInventory();
        System.out.print("Enter the ID of the product to add to the cart: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Find the product in the inventory
        Product productToAdd = ECommerceApp.findProductById(productId);

        if (productToAdd == null) {
            System.out.println("Product not found in the inventory.");
            return;
        }
        items.add(productToAdd);
        System.out.println(productToAdd.getName() + " added to the shopping cart.");
    }


    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the product to remove from the cart: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Find the product in the cart
        Product productToRemove = findProductById(productId);

        if (productToRemove == null) {
            System.out.println("Product not found in the cart.");
            return;
        }
        items.remove(productToRemove);
        System.out.println(productToRemove.getName() + " removed from the shopping cart.");
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : items) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getName() + ", Price: DT" + product.getPrice());
        }
    }

    public void checkout() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        System.out.println("Total: $" + total);
    }

    private Product findProductById(int productId) {
        for (Product product : items) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static void clearCart() {
        items.clear();
        System.out.println("Shopping cart cleared.");
    }
}

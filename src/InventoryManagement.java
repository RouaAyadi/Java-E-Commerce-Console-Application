import java.util.Scanner;

public class InventoryManagement {
    static Scanner scanner = new Scanner(System.in);

    public InventoryManagement() {
    }
    public static void checkStockLevels() {
        Inventory.displayInventory();
        System.out.print("Enter the ID of the product to check stock levels: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        // Find the product in the inventory
        Product productToCheck = ECommerceApp.findProductById(productId);

        if (productToCheck != null) {
            System.out.println("Stock levels for " + productToCheck.getName() + ": " + productToCheck.getQuantity());
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public static void updateStock() {
        System.out.print("Enter the ID of the product to update stock: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Find the product in the inventory
        Product productToUpdate = ECommerceApp.findProductById(productId);

        if (productToUpdate != null) {
            System.out.print("Enter the new stock level: ");
            int newStockLevel = scanner.nextInt();
            scanner.nextLine();

            // Update the stock level
            productToUpdate.setQuantity(newStockLevel);

            System.out.println("Stock level updated successfully.");
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
}

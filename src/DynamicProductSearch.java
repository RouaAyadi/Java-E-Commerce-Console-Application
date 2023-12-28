import java.util.ArrayList;
import java.util.Scanner;

public class DynamicProductSearch {
    static Scanner scanner = new Scanner(System.in);

    public DynamicProductSearch() {
    }

    public static void searchProductsByName() {
        System.out.print("Enter the product name to search: ");
        String productName =scanner.nextLine();

        ArrayList<Product> products = Inventory.getProducts();
        Product p = searchByName(products, productName);

        if (p == null) {
            System.out.println("Product not found.");
        } else {
            System.out.println("Product found: " + p.getName());
        }
    }

    public static Product searchByName(ArrayList<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static void applyFilters() {
        System.out.print("Enter the minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine();
        ArrayList<Product> products = Inventory.getProducts();
        // Perform product filtering by price range
        ArrayList<Product> filteredResults = filterByPriceRange(products, minPrice, maxPrice);

        if (!filteredResults.isEmpty()) {
            System.out.println("Filtered Results:");
            for (Product result : filteredResults) {
                System.out.println("ID: " + result.getProductId() + ", Name: " + result.getName() + ", Price: DT" + result.getPrice());
            }
        } else {
            System.out.println("No products found matching the filter criteria.");
        }
    }

    public static ArrayList<Product> filterByPriceRange(ArrayList<Product> products, double minPrice, double maxPrice) {
        ArrayList<Product> filteredResults = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredResults.add(product);
            }
        }
        return filteredResults;
    }

}

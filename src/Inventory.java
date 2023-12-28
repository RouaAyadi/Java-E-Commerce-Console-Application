import java.util.Scanner;
import java.util.ArrayList;



class Inventory {
    public static ArrayList<Product> products = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addProductToInventory() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("If it's a convenience product type C \nif it's an electronic product type E \n" +
                "if it's a medical product print M: ");
        String t = scanner.nextLine();
        switch (t) {
            case "C" -> {
                System.out.print("Enter product brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter product type: ");
                String type = scanner.nextLine();
                Product newProduct = new ConvinienceProduct(products.size() + 1, name, price, quantity, brand, type);
                products.add(newProduct);
            }
            case "E" -> {
                System.out.print("Enter product brand: ");
                String brand = scanner.nextLine();
                Product newProduct = new ElectronicsProduct(products.size() + 1, name, price, quantity, brand);
                products.add(newProduct);
            }
            case "M" -> {
                System.out.print("Enter product brand: ");
                String brand = scanner.nextLine();
                Product newProduct = new MedicalProduct(products.size() + 1, name, price, quantity, brand);
                products.add(newProduct);
            }
            case null, default -> System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("Product added to inventory successfully.");
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public void removeProductFromInventory() {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        Product product = findProductById(productId);
        if (product != null) {
            products.remove(product);
            System.out.println("Product removed from inventory successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getName() + ", Price: DT" + product.getPrice());
        }
    }

    public void updateProductQuantity() {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        Product product = findProductById(productId);
        if (product != null) {
            System.out.print("Enter new quantity: ");
            int quantity = scanner.nextInt();
            product.setQuantity(quantity);
            System.out.println("Product quantity updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void updateProductPrice() {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        Product product = findProductById(productId);
        if (product != null) {
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            product.setPrice(price);
            System.out.println("Product price updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }


}
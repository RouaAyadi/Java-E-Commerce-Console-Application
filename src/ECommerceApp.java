import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class ECommerceApp {
    private static  Scanner scanner = new Scanner(System.in);
    private static User currentUser = null;
    private static final ArrayList<Product> products = new ArrayList<>();
    private static final ShoppingCart shoppingCart = new ShoppingCart();
    private static final Inventory inventory = new Inventory();
    private static final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private static final ReviewService reviewService = new ReviewService();
    private static final ShippingOption shippingOption = new ShippingOption();
    private static final Order order = new Order();

    public static void main(String[] args) {
        String Role;
        initializeData();
        boolean exit = false;
        System.out.print("If you are a customer type C and if you are an admi type A: ");
        String role = scanner.nextLine();
        if (Objects.equals(role, "C")) {
            while (!exit) {
                printMainMenuCustomer();
                int choice = scanner.nextInt();
                scanner.nextLine();
                while (currentUser == null && choice != 1) {
                    System.out.println("Please login first.");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                }

                switch (choice) {
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter your username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        currentUser = new User(username, password, role);
                        System.out.println("Login successful. Welcome, " + username + "!");
                        break;
                    case 2:
                        shoppingCartMenu();
                        break;
                    case 3:
                        orderProcessingMenu();
                        break;
                    case 4:
                        dynamicProductSearchMenu();
                        break;
                    case 5:
                        paymentProcessingMenu();
                        break;

                    case 6:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Enter Product ID");
                        int productId1 = scanner1.nextInt();
                        scanner1.nextLine();
                        System.out.println("Enter Username");
                        String username1 = scanner1.nextLine();
                        System.out.println("Enter Rating");
                        int rating1 = scanner1.nextInt();
                        scanner1.nextLine();
                        System.out.println("Enter Comments");
                        String comments1 = scanner1.nextLine();
                        Review r=new Review(productId1,username1,rating1,comments1);
                        reviewService.addReview(r);
                        break;

                    case 7:
                        reviewService.getAllReviews();
                        break;
                    case 8:
                        shippingOption.chooseShippingOption();
                        break;
                    case 9:
                        handleLogout();
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("Thank you for using the E-Commerce App!");
        } else if (Objects.equals(role, "A")) {
            while (!exit) {
                printMainMenuAdmin();
                int choice = scanner.nextInt();
                scanner.nextLine();

                while (currentUser == null && choice != 1) {
                    System.out.println("Please login first.");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                }

                switch (choice) {
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter your username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        currentUser = new User(username, password, role);
                        System.out.println("Login successful. Welcome, " + username + "!");
                        break;
                    case 2:
                        productManagementMenu();
                        break;
                    case 3:
                        inventoryManagementMenu();
                        break;
                    case 4:
                        handleLogout();
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            System.out.println("Thank you for using the E-Commerce App!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void initializeData() {
        // Sample Products
        Product laptop = new ElectronicsProduct(1, "Laptop", 2100, 4, "MSI");
        Product smartphone = new ElectronicsProduct(2, "Smartphone", 499, 5, "Iphone");
        Product headphones = new ElectronicsProduct(3, "Headphones", 99, 6, "Lenovo");
        Product milk=new ConvinienceProduct(4,"Milk",2.99,10,"Vitalait","Dairy");
        Product cacke=new ConvinienceProduct(5,"Cake",1.99,10,"fiandise","Bakery");
        Product pills=new MedicalProduct(6,"Pills",3.99,10,"Doliprane");
        // Add products to the list
        Inventory.products.add(laptop);
        Inventory.products.add(smartphone);
        Inventory.products.add(headphones);
        Inventory.products.add(milk);
        Inventory.products.add(cacke);
        Inventory.products.add(pills);

    }

    private static void printMainMenuAdmin() {
        // Print the main menu options
        System.out.println("E-Commerce Console Application");
        System.out.println("1. Login");
        System.out.println("2. Product Management");
        System.out.println("3. Inventory Management");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void printMainMenuCustomer() {
        // Print the main menu options
        System.out.println("E-Commerce Console Application");
        System.out.println("1. Login");
        System.out.println("2. Shopping Cart");
        System.out.println("3. Order Processing");
        System.out.println("4. Dynamic Product Search and Filtering");
        System.out.println("5. Payment Processing");
        System.out.println("6. add a review");
        System.out.println("7. get all reviews");
        System.out.println("8. Shipping Option");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleLogout() {
        if (currentUser != null) {
            System.out.println("Logout successful. Goodbye, " + currentUser.getUsername() + "!");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    private static void productManagementMenu() {
        boolean productMenuExit = false;

        while (!productMenuExit) {
            printProductManagementMenu();
            int productMenuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (productMenuChoice) {
                case 1:
                    inventory.addProductToInventory();
                    break;
                case 2:
                    inventory.updateProductQuantity();
                    inventory.updateProductPrice();
                    break;
                case 3:
                    inventory.removeProductFromInventory();
                    break;
                case 4:
                    Inventory.displayInventory();
                case 5:
                    productMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printProductManagementMenu() {
        // Print product management menu options
        System.out.println("Product Management Menu");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Remove Product");
        System.out.println("4. Display Products in inventory");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }


    private static void shoppingCartMenu() {
        boolean cartMenuExit = false;

        while (!cartMenuExit) {
            printShoppingCartMenu();
            int cartMenuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (cartMenuChoice) {
                case 1:
                    shoppingCart.addProduct();
                    break;
                case 2:
                    shoppingCart.removeProduct();
                    break;
                case 3:
                    shoppingCart.displayCart();
                    break;
                case 4:
                    cartMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static Product findProductById(int productId) {
        ArrayList<Product> products = Inventory.getProducts();
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    private static void printShoppingCartMenu() {
        // Print shopping cart menu options
        System.out.println("Shopping Cart Menu");
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove from Cart");
        System.out.println("3. Display Cart");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void orderProcessingMenu() {

        boolean orderMenuExit = false;

        while (!orderMenuExit) {
            printOrderProcessingMenu();
            int orderMenuChoice = scanner.nextInt();
            scanner.nextLine();
            Order order = new Order();
            switch (orderMenuChoice) {
                case 1:
                    Order.processOrder();
                    break;
                case 2:
                    Order.cancelOrder();
                    break;
                case 3:
                    orderMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    private static void printOrderProcessingMenu() {
        // Print order processing menu options
        System.out.println("Order Processing Menu");
        System.out.println("1. Process Order");
        System.out.println("2. Cancel Order");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void inventoryManagementMenu() {
        boolean inventoryMenuExit = false;

        while (!inventoryMenuExit) {
            printInventoryManagementMenu();
            int inventoryMenuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (inventoryMenuChoice) {
                case 1:
                    InventoryManagement.checkStockLevels();
                    break;
                case 2:
                    InventoryManagement.updateStock();
                    break;
                case 3:
                    inventoryMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void dynamicProductSearchMenu() {
        boolean searchMenuExit = false;

        while (!searchMenuExit) {
            printDynamicProductSearchMenu();
            int searchMenuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (searchMenuChoice) {
                case 1:
                    DynamicProductSearch.searchProductsByName();
                    break;
                case 2:
                    DynamicProductSearch.applyFilters();
                    break;
                case 3:
                    searchMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void paymentProcessingMenu() {
        boolean paymentMenuExit = false;

        while (!paymentMenuExit) {
            printPaymentProcessingMenu();
            int paymentMenuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (paymentMenuChoice) {
                case 1:
                    selectPaymentMethod();
                    break;
                case 2:
                    paymentMenuExit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void selectPaymentMethod() {

            System.out.println("Payment Methods:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.print("Enter your choice: ");
            int paymentMethodChoice = scanner.nextInt();
            scanner.nextLine();

            switch (paymentMethodChoice) {
                case 1:
                    System.out.print("Enter your credit card number: ");
                    String creditCardNumber = scanner.nextLine();
                    paymentProcessor.processPayment(creditCardNumber, "Credit Card");
                    break;
                case 2:
                    System.out.print("Enter your PayPal username: ");
                    String payPalUsername = scanner.nextLine();
                    paymentProcessor.processPayment(payPalUsername, "PayPal");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }

    private static void printInventoryManagementMenu() {
        System.out.println("Inventory Management Menu");
        System.out.println("1. Check Stock Levels");
        System.out.println("2. Update Stock");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void printDynamicProductSearchMenu() {
        System.out.println("Dynamic Product Search Menu");
        System.out.println("1. Search by Name");
        System.out.println("2. Apply Filters");
        System.out.println("3. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void printPaymentProcessingMenu() {
        System.out.println("Payment Processing Menu");
        System.out.println("1. Select Payment Method");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");
    }
}

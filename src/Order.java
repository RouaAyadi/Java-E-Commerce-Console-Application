import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static ArrayList<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public static void processOrder(){
        for (Product product : ShoppingCart.getItems()) {
            products.add(product);
        }
        for (Product product : products) {
            System.out.println("Order Details:");
            System.out.println("ID: " + product.getProductId() + ", Name: " + product.getName() + ", Price: DT" + product.getPrice());
        }
        ShoppingCart.clearCart();
        System.out.println("Order processed");

    }

    public static void cancelOrder(){
        ShoppingCart.clearCart();
        System.out.println("Order cancelled");
    }

    public static ArrayList<Product> getAllOrders() {
        return products;
    }
}



import java.util.Objects;
import java.util.Scanner;


public class ShippingOption {
    Scanner scanner = new Scanner(System.in);



    public ShippingOption() {
    }

    public void chooseShippingOption() {
        System.out.println("Shipping options are: ");
        System.out.println("1. Standard Shipping");
        System.out.println("2. Express Shipping");
        System.out.println("3. Same Day Shipping");
        System.out.println("Choose shipping option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Standard Shipping");
            case 2 -> System.out.println("Express Shipping");
            case 3 -> System.out.println("Same Day Shipping");
            default -> System.out.println("Invalid choice. Please try again.");
        }

    }



}

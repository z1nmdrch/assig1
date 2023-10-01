import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to purchase?");
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 500.0);
        Product product3 = new Product("Headphones", 50.0);
        System.out.println("1.Laptop - 1000$");
        System.out.println("2.Smartphone - 500$");
        System.out.println("3.Headphone - 50$");


        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int want = sc.nextInt();

            if (want == 0) {
                break;
            }

            switch (want) {
                case 1:
                    cart.addProduct(product1);
                    break;
                case 2:
                    cart.addProduct(product2);
                    break;
                case 3:
                    cart.addProduct(product3);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println("Enter the product number you want to remove (1, 2, 3):");
        System.out.println("Click any other number to cancel the remove");
        int productToRemove = sc.nextInt();
        switch (productToRemove) {
            case 1:
                cart.removeProduct(product1);
                break;
            case 2:
                cart.removeProduct(product2);
                break;
            case 3:
                cart.removeProduct(product3);
                break;
            default:
                System.out.println("Excellent");
        }
        cart.checkout();
        double total = cart.calculateTotal();
        System.out.println("Updated Total: $" + total);
    }
}

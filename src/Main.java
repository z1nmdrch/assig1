import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to purchase?");
        Devica devica1 = new Devica("Laptop", 1000.0);
        Devica devica2 = new Devica("Smartphone", 500.0);
        Devica devica3 = new Devica("Headphones", 50.0);
        System.out.println("1.Laptop - 1000$");
        System.out.println("2.Smartphone - 500$");
        System.out.println("3.Headphone - 50$");

        Basket cart = Basket.getInstance();

        DevicaDecorator discountedLaptop = new DiscountDecorator(devica1, 0.10);
        cart.addDevica(discountedLaptop);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int want = sc.nextInt();

            if (want == 0) {
                break;
            }

            switch (want) {
                case 1:
                    cart.addDevica(devica1);
                    break;
                case 2:
                    cart.addDevica(devica2);
                    break;
                case 3:
                    cart.addDevica(devica3);
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
                cart.removeDevica(devica1);
                break;
            case 2:
                cart.removeDevica(devica2);
                break;
            case 3:
                cart.removeDevica(devica3);
                break;
            default:
                System.out.println("Excellent");
        }
        cart.checkout();
        double total = cart.calculateTotal();
        System.out.println("Тo be paid: $" + total);
    }
}
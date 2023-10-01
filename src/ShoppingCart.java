import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        System.out.println("Shopping Cart:");
        for (Product product : items) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static Basket instance;
    private List<DevicaDecorator> items = new ArrayList<>();

    public static Basket getInstance() {
        if (instance == null) {
            instance = new Basket();
        }
        return instance;
    }

    public void addDevica(DevicaDecorator devica) {
        items.add(devica);
    }

    public void removeDevica(DevicaDecorator devica) {
        items.remove(devica);
    }

    public double calculateTotal() {
        double total = 0;
        for (DevicaDecorator product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        System.out.println("Basket:");
        for (DevicaDecorator product : items) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}

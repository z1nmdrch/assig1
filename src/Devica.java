public class Devica implements DevicaDecorator {
    private String name;
    private double price;

    public Devica(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

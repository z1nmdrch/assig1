public class DiscountDecorator implements DevicaDecorator {
    private Devica devica;
    private double discount;

    public DiscountDecorator(Devica devica, double discount) {
        this.devica = devica;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return devica.getPrice() * (1 - discount);
    }

    @Override
    public String getName() {
        return devica.getName() + " (Discounted)";
    }
}
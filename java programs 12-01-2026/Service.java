public class Service extends Product {
    private final int durationHours;
    private static final double TAX_RATE = 0.10;

    public Service(String name, double price, int durationHours) {
        super(name, price);
        this.durationHours = durationHours;
    }

    @Override
    public double calculateFinalPrice() {
        return price + (price * TAX_RATE);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + durationHours + " hours");
        System.out.println("Final Price (with tax): $" + calculateFinalPrice());
    }
}

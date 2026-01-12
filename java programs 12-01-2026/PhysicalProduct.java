public class PhysicalProduct extends Product {

    private final double shippingCost;

    public PhysicalProduct(String name, double price, double shippingCost) {
        super(name, price);
        this.shippingCost = shippingCost;
    }

    @Override
    public double calculateFinalPrice() {
        return price + shippingCost;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Shipping Cost: " + shippingCost);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

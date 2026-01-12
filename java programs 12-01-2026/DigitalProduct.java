public class DigitalProduct extends Product {
    private final double fileSizeMB;

    public DigitalProduct(String name, double price, double fileSizeMB) {
        super(name, price);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public double calculateFinalPrice() {
        return price; // No shipping
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }
}

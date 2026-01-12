public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: $" + price);
    }
}

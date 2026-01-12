public class Main {
    public static void main(String[] args) {

        Product p1 = new PhysicalProduct("Laptop", 1000, 50);
        Product p2 = new DigitalProduct("E-Book", 20, 5);
        Product p3 = new Service("Consulting", 200, 3);

        Product[] products = { p1, p2, p3 };

        for (Product p : products) {
            p.displayInfo();
            System.out.println("-----------------------");
        }
    }
}

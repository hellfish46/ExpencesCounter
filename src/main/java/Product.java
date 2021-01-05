public class Product {

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;
    private double partialPrice;

    public double getPartialPrice() {
        return partialPrice;
    }

    public void setPartialPrice(double partialPrice) {
        this.partialPrice = partialPrice;
    }

    public double getPrice() {
        return price;
    }
}

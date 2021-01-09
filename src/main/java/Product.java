public class Product {

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;
    private double partialPrice;
    private int divider = 0; //Count of users who eats this

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

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

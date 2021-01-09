public class Product {

    public Product(String name, double price, User owner) {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    private String name;
    private double price;
    private double partialPrice;
    private int divider = 0; //Count of users who eats this
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

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

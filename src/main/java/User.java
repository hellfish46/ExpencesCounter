import java.util.ArrayList;
import java.util.List;

public class User {

    public User(String name) {
        this.name = name;
    }

    public User(String name, Product userBought) {
        this.name = name;
        this.userBought = userBought;
    }

    private String name;
    private Product userBought;
    private double userMustGiveMoney;
    private double userMustReceiveMoney;
    private List<Product> userDoesNotEatThis = new ArrayList<Product>();
    private double partialContribution = 0.0;

    public String getName() {
        return name;
    }

    public double getPartialContribution() {
        return partialContribution;
    }

    public void setPartialContribution(double partialContribution) {
        this.partialContribution = partialContribution;
    }

    public Product getUserBought() {
        return userBought;
    }

    public void setUserBought(Product userBought) {
        this.userBought = userBought;
    }

    public double getUserMustGiveMoney() {
        return userMustGiveMoney;
    }

    public void setUserMustGiveMoney(double userMustGiveMoney) {
        this.userMustGiveMoney = userMustGiveMoney;
    }

    public double getUserMustReceiveMoney() {
        return userMustReceiveMoney;
    }

    public void setUserMustReceiveMoney(double userMustReceiveMoney) {
        this.userMustReceiveMoney = userMustReceiveMoney;
    }

    public List<Product> getUserDoesNotEatThis() {
        return userDoesNotEatThis;
    }

    public void setUserDoesNotEatThis(List<Product> userDoesNotEatThis) {
        this.userDoesNotEatThis = userDoesNotEatThis;
    }
}

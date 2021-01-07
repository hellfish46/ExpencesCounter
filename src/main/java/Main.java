import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User artyom = new User("Artyom");
        User pavel = new User("Pavel");
        User eugen = new User("Eugen");
        User anton = new User("Anton");
        List<User> users = new ArrayList<User>();
        users.add(artyom);
        users.add(pavel);
        users.add(eugen);
        users.add(anton);

        Product meat = new Product("Meat", 320.00);
        Product garnish = new Product("Garnish", 60.00);
        Product drink = new Product("Drink", 220.00);

        artyom.setUserBought(meat);
        pavel.setUserBought(garnish);
        eugen.setUserBought(drink);

        List<Product> products = new ArrayList<Product>();
        products.add(meat);
        products.add(garnish);
        products.add(drink);

        List<Product> notEatDrink = new ArrayList<Product>();
        notEatDrink.add(drink);

        pavel.setUserDoesNotEatThis(notEatDrink);

        Calculation calculation = new Calculation();
        calculation.findPartialCostOfEachProduct(users, products);

//        System.out.println(meat.getPartialPrice());
//        System.out.println(garnish.getPartialPrice());
//        System.out.println(drink.getPartialPrice());



        calculation.calculateExpensePerUser(users,products);

        calculation.defineReceiverAndReturner(users);






    }
}

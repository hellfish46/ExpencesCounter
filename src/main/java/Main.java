import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User artyom = new User("Artyom");
        User alex = new User("Alex");
        User eugen = new User("Eugen");
        User anton = new User("Anton");
        User rabiia = new User("Rabiia");
        User nastya = new User("Nastya");
        User marina = new User("Marina");

        artyom.setCouple(nastya);
        alex.setCouple(marina);
        anton.setCouple(rabiia);
        List<User> users = new ArrayList<User>();
        users.add(artyom);
        users.add(alex);
        users.add(eugen);
        users.add(anton);


        Product pizza = new Product("Pizza", 417.00);
        Product juice = new Product("Juice", 110.00);
       // Product drink = new Product("Drink", 220.00);

        artyom.setUserBought(pizza);
        alex.setUserBought(juice);
       // eugen.setUserBought(drink);

        List<Product> products = new ArrayList<Product>();
        products.add(pizza);
        products.add(juice);
       // products.add(drink);

        List<Product> notEatDrink = new ArrayList<Product>();
      //  notEatDrink.add(drink);

        //pavel.setUserDoesNotEatThis(notEatDrink);

        Calculation calculation = new Calculation();



        calculation.defineDividerPerProduct(users,products);
        calculation.findPartialCostOfEachProduct(users,products);
        System.out.println(pizza.getPartialPrice());
        System.out.println(juice.getPartialPrice());
        calculation.defineHowMuchMoneyUserHaveToReceiveBack(users);




//        calculation.calculateExpensePerUser(users,products);
//
//        calculation.defineReceiverAndReturner(users);






    }
}

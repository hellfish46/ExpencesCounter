import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User artyom = new User("Artyom");
        User alex = new User("Alex");
        User eugen = new User("Eugen");
        User anton = new User("Anton");
        User pavel = new User("Pavel");
        User rabiia = new User("Rabiia");
        User nastya = new User("Nastya");
        User marina = new User("Marina");
        User anna = new User("Anna");

        artyom.setCouple(nastya);
        alex.setCouple(marina);
        anton.setCouple(rabiia);
        pavel.setCouple(anna);




        List<User> users = new ArrayList<User>();
        users.add(artyom);
        users.add(alex);
        users.add(eugen);
        users.add(anton);
        users.add(pavel);


        Product meat = new Product("Meat", 726.00, artyom);
        Product juice = new Product("Juice", 136.00, pavel);
        Product potatoes = new Product("Potatoes", 112.00, alex);
        Product drink = new Product("Drink", 152.00, eugen);
       // Product drink = new Product("Drink", 220.00);

        List<Product> doNotEat = new ArrayList<Product>();
        doNotEat.add(drink);
        pavel.setUserDoesNotEatThis(doNotEat);
        anna.setUserDoesNotEatThis(doNotEat);

        artyom.setUserBought(meat);
        pavel.setUserBought(juice);
        alex.setUserBought(potatoes);
        eugen.setUserBought(drink);
       // eugen.setUserBought(drink);

        List<Product> products = new ArrayList<Product>();
        products.add(meat);
        products.add(juice);
        products.add(potatoes);
        products.add(drink);
       // products.add(drink);

        List<Product> notEatDrink = new ArrayList<Product>();
      //  notEatDrink.add(drink);

        //pavel.setUserDoesNotEatThis(notEatDrink);

        Calculation calculation = new Calculation();



        calculation.defineDividerPerProduct(users,products);
        calculation.findPartialCostOfEachProduct(users,products);
        System.out.println(meat.getPartialPrice());
        System.out.println(juice.getPartialPrice());
        System.out.println(potatoes.getPartialPrice());
        System.out.println(drink.getPartialPrice());
        calculation.defineHowMuchMoneyUserHaveToReceiveBack(users);
        calculation.calculateWhoMustPayToWhom(users,products);




//        calculation.calculateExpensePerUser(users,products);
//
//        calculation.defineReceiverAndReturner(users);






    }
}

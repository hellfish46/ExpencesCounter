import java.util.List;

public class Calculation {


    public void findPartialCostOfEachProduct(List<User> users, List<Product> products){
        //Product product:products
        for (Product product:products){
            //product1
            int divider = users.size();
            for (User user:users) {
                if(user.getUserDoesNotEatThis().contains(product)){
                    divider = divider - 1;
                };
            }
            //Math.round(product.getPrice()/divider*10)

            double i = product.getPrice()/divider*10;
            double z = Math.round(i);
            double x = z/10;
            product.setPartialPrice(x);
        }
    }

    public void calculateExpensePerUser(List<User> users, List<Product> products){
        for (Product product:products){
            for (User user:users) {
                if(user.getUserDoesNotEatThis().contains(product)){

                };
            }

        }
    }





}

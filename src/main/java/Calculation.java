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
                if(!user.getUserDoesNotEatThis().contains(product)){
                    user.setPartialContribution(user.getPartialContribution()+product.getPartialPrice());
                };
            }

        }
    }

    public void defineReceiverAndReturner(List<User> users){

            for (User user:users) {

                Double partialContribution = user.getPartialContribution();
                if(user.getUserBought() == null){
                    System.out.println(user.getName() + " has to PAY " + (partialContribution));
                    continue;
                }

                Double priceOfDeliveredProduct = user.getUserBought().getPrice();

                if(priceOfDeliveredProduct > partialContribution){
                    System.out.println(user.getName() + " has to RECEIVE " + (priceOfDeliveredProduct - partialContribution));
                } else if (partialContribution > priceOfDeliveredProduct){
                    System.out.println(user.getName() + " has to PAY " + (partialContribution - priceOfDeliveredProduct));
                } else if (partialContribution == priceOfDeliveredProduct){
                    System.out.println(user.getName() + " has to NEITHER receive NOR pay");
                }
            };



    }





}

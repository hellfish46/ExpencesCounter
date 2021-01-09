import java.util.List;

public class Calculation {


    public void findPartialCostOfEachProduct(List<User> users, List<Product> products){
        //Product product:products
        for (Product product:products){
            //product1


            double i = product.getPrice()/product.getDivider()*10;
            double z = Math.round(i);
            double x = z/10;
            product.setPartialPrice(x);
        }
    }


    public void defineDividerPerProduct(List<User> users, List<Product> products){
        for (Product product:products){
            //product1
            //int divider = users.size();

            for (User user:users) {
                User couple = user.getCouple();

                if(!user.getUserDoesNotEatThis().contains(product)){
                    product.setDivider(product.getDivider()+1);
                }
                if(couple!=null){
                    if(!couple.getUserDoesNotEatThis().contains(product)){
                        product.setDivider(product.getDivider()+1);
                    }
                }

                };
            }
    }

    public void defineHowMuchMoneyUserHaveToReceiveBack(List<User> users){
        for(User user:users){
            Product boughtProduct = user.getUserBought();
            User couple = user.getCouple();
            if(boughtProduct != null){
                double userMustReceiveMoney = user.getUserBought().getPrice();
                if(!user.getUserDoesNotEatThis().contains(boughtProduct)){
                    userMustReceiveMoney = userMustReceiveMoney-boughtProduct.getPartialPrice();
                }
                if(couple != null){
                    if(!couple.getUserDoesNotEatThis().contains(boughtProduct)){
                        userMustReceiveMoney = userMustReceiveMoney-boughtProduct.getPartialPrice();
                    }
                }
                user.setUserMustReceiveMoney(userMustReceiveMoney);

            }

            System.out.println(user.getName()+ " receives " + user.getUserMustReceiveMoney());




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

import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

public class Transaction extends TimerTask
{
    int minAmount = 1000;
    int maxAmount = 20000;
    User user = new User();
    GiftsList gifts = new GiftsList();
    @Override
    public void run(){


        Random random = new Random();

        //to get the random user
        int randomIndex  = 0 + random.nextInt(4-0);
        String userName = User.listOfUsers.get(randomIndex).getUserName();

        //to get the random transaction amount
        int randomAmt = minAmount + random.nextInt(maxAmount- minAmount+1);

        //points calculation
        int rewardPoints = (User.listOfUsers.get(randomIndex).getUserPoints() +(randomAmt/100));
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("User " +userName + " has done a transaction Amount of Rs: "+ randomAmt +
               " to purchase an item and has earned reward points of " + rewardPoints);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //to set\add  the points to specific user
        User.listOfUsers.get(randomIndex).setUserPoints(rewardPoints);

        //PRINT THE REWARDS
        for(User user : User.listOfUsers){

            if(user.getUserPoints() >0){
                System.out.println("hello " +User.listOfUsers.get(randomIndex).getUserName() + "Do yo want to redeem your points? Yes/No");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.next();
                if(userInput.equalsIgnoreCase("Yes")){
                    switch(User.listOfUsers.get(randomIndex).getUserPoints()>=100 && User.listOfUsers.get(randomIndex).getUserPoints() <=200 ?1:
                            User.listOfUsers.get(randomIndex).getUserPoints()>200 && User.listOfUsers.get(randomIndex).getUserPoints() <=3000 ?2:0 ){
                        case 0:
                        {
                            System.out.println("Required some more points to redeem");
                            break;
                        }

                        case 1:
                        {
                            System.out.println("SHOPPING COUPON CARDS, Choose any one");
                            for(int i=0; i< gifts.couponCards.length;i++){
                                System.out.println(i+1 +")" +gifts.couponCards[i]);
                            }
                            int userOption = scanner.nextInt();
                            user.setUserPoints(User.listOfUsers.get(randomIndex).getUserPoints() - 100) ;
                            System.out.println("Thank you , Your points has been redeemed and your balance reward points is:" +User.listOfUsers.get(randomIndex).getUserPoints());
                            break;
                        }

                        case 2:
                        {
                            System.out.println("TRAVEL COUPON CARDS, Choose any one");
                            for(int i=0; i< gifts.travelCC.length;i++){
                                System.out.println(i+1 +")" +gifts.travelCC[i]);
                            }
                            int userOption = scanner.nextInt();
                            user.setUserPoints(User.listOfUsers.get(randomIndex).getUserPoints() - 200) ;
                            System.out.println("Thank you , Your points has been redeemed and your balance reward points is:" +User.listOfUsers.get(randomIndex).getUserPoints());
                            break;
                        }
                    }
                }else{
                    System.out.println("Thank you and have a nice day!");


                }
            }
        }


    }
}


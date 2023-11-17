import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("WELCOME TO THE REWARD APPLICATION");
        System.out.println("List of 5 Users who are going to use:");

        System.out.println("---------------------------------------------------------------");

        User user = new User();
        user.initialiseUsers();

        System.out.println("---------------------------------------------------------------");

        Transaction trans = new Transaction();
        Timer timer = new Timer();
        timer.schedule(trans,0,10000);


    }

}

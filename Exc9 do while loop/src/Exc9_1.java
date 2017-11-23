import java.util.Scanner;
import java.util.Random;

public class Exc9_1 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();

        String again;

        do {                                      //missing value of "again", still working because of do while

            int flip = rng.nextInt(2);
            String coin;

            if ( flip == 1)
                coin = "Heads";
            else
                coin = "Tails";

            System.out.println("You flip a coin and it is... " + coin);
            System.out.print("Would you like to flip again (y/n)? ");
            again = keyboard.next();
        } while (again.equals("y"));
    }
}

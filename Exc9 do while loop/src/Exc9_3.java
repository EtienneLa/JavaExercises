import java.util.Random;
import java.util.Scanner;

public class Exc9_3 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        int num = 1+rng.nextInt(10);
        int tries = 0;
        int guess;
        System.out.println("I've chosen a number between 1 and 10. Try to guess it.");

        do {
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            tries++;

            if ( guess == num)
                System.out.println("That's right! It only took " + tries + (" tries!"));
            else
                System.out.println("That's incorrect. Guess again.");
        } while ( guess != num);
    }
}

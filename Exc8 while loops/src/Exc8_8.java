import java.util.Random;
import java.util.Scanner;

public class Exc8_8 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int n = 1+r.nextInt(100);
        int tries = 0;
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int input = keyboard.nextInt();
        tries++;

        while ( input != n && tries < 7){

            if ( input < n){
                System.out.println("Sorry, you are too low.");
                System.out.print("Guess #" + (tries+1)+": ");
                input = keyboard.nextInt();
                tries++;
            }
            else if ( input > n){
                System.out.println("Sorry, you are too high.");
                System.out.print("Guess #" + (tries+1)+": ");
                input = keyboard.nextInt();
                tries++;
            }
        }
        if ( input == n)
            System.out.println("You guessed it! What are the odds?!");
        else
            System.out.println("You failed, try again!");



    }
}

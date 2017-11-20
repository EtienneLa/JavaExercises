import java.util.Random;
import java.util.Scanner;

public class Exc7_6 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int roll = 1 + r.nextInt(100);
        int in;

        System.out.print("I'm thinking of a number between 1-100. Try to guess it.\n> ");
        in = keyboard.nextInt();

        if ( in == roll)
            System.out.println("\n How did you know?! That's right!");
        else if ( in > roll)
            System.out.println("\nThat's too high. I was thinking of " + roll + ".");
        else if ( in < roll)
            System.out.println("\nThat's too low. I was thinking of " + roll + ".");
    }
}

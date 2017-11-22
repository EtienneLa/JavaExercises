import java.util.Scanner;
import java.util.Random;

public class Exc8_7 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int n = 1+r.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();

        int tries = 0;

        while ( guess != n){
            System.out.println("Incorrect!");
            System.out.print("Try again: ");
            guess = keyboard.nextInt();
            tries++;
        }
        if ( guess == n && tries < 3){
            System.out.println("That is right! You're a good guesser!");
            System.out.println("You needed " + tries +" tries.");
        }
        else if ( guess == n && tries > 3 ){
            System.out.println("That is right! But you can do better!");
            System.out.println("You needed " + tries +" tries.");
        }
    }
}

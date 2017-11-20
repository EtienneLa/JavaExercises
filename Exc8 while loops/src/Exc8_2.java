import java.util.Random; import java.util.Scanner;

public class Exc8_2 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int rn = 1 + r.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();

        while ( guess != rn){
            System.out.println("\nThis is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
        }

        System.out.println("\nThat's right!");
    }
}

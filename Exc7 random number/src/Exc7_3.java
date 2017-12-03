import java.util.Scanner; import java.util.Random;

public class Exc7_3 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int hn = 1+r.nextInt(10);
        int in;

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        in = keyboard.nextInt();

        if ( hn == in )
            System.out.println("That's right! My secret number was " + hn + ".");
        else if ( hn != in)
            System.out.println("That's not correct, I was thinking of " + hn + ".");
    }
}

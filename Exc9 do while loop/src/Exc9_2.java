import java.util.Random;

public class Exc9_2 {

    public static void main(String[]args){

        Random rng = new Random();
        int roll1;
        int roll2;

        System.out.println("HERE COME THE DICES!");

        do {
            roll1 = 1+rng.nextInt(6);
            roll2 = 1+rng.nextInt(6);

            System.out.println("\nRoll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            System.out.println("The total is " + (roll1+roll2) + "!");
        } while ( roll1 != roll2 );
    }
}

import java.util.Random;

public class Exc11_baby_blackjack {

    public static void main(String[]args){

        Random rng = new Random();

        System.out.println("Baby Blackjack!");
        System.out.println();

        int p1 = 1+rng.nextInt(10);
        int p2 = 1+rng.nextInt(10);
        int d1 = 1+rng.nextInt(10);
        int d2 = 1+rng.nextInt(10);
        int ph = p1+p2;
        int dh = d1+d2;

        System.out.println("You drew " +p1 +" and " +p2 +".");
        System.out.println("The total is " +ph +".");
        System.out.println("\nThe dealer drew " +d1 + " and " +d2 +".");
        System.out.println("Dealer's total is " +dh +".");

        if ( ph > dh)
            System.out.println("\nYOU WIN!");
        else
            System.out.println("\nDEALER WINS!");
    }
}

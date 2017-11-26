import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    public static void main(String[]args){

        Scanner kb = new Scanner(System.in);
        Random rng = new Random();

        int p1 = 2+rng.nextInt(10);                                                                              //player cards
        int p2 = 2+rng.nextInt(10);
        String hors;

        int d1 = 2+rng.nextInt(10);                                                                              //dealer cards
        int d2 = 2+rng.nextInt(10);

        int pt = p1+p2;
        int dt = d1+d2;

        System.out.println("Welcome to my Blackjack program!");
        System.out.println();

        System.out.println("You drew " +p1 +" and " +p2 +".");                                                          //overview
        System.out.println("Your total is " +pt +".");
        System.out.println();
        System.out.println("The dealer has a " +d1 +" showing and a hidden card.");
        System.out.println("His total is also hidden.");
        System.out.println();
                                                                                                                         //player round
        do {
            System.out.print("Would you like to 'Hit' or 'Stay'? ");
            hors = kb.next();

            if (hors.equals("Hit")){
                int p3 = 2+rng.nextInt(10);
                pt = pt+p3;
                System.out.println("You drew a " +p3 +".");
                System.out.println("Your new total is " +pt +".");
            }
        }while( pt <= 21 && hors.equals("Hit"));

        if ( pt > 21){                                                                                                  //player busts
            System.out.println("\nYou bust (got a total over 21), DEALER WINS!");
            System.exit(0);
        }

        System.out.println();                                                                                           //dealer round
        System.out.println("Okay, dealer's turn now.");
        System.out.println("His hidden card was " +d2 +".");
        System.out.println("His hidden total was " +dt +".");
        System.out.println();

        while (dt <= 16 && dt < pt){
            System.out.println("Dealer choses to hit.");
            int d3 = 2+rng.nextInt(10);
            dt = dt+d3;
            System.out.println("He drew " +d3 +".");
            System.out.println("His new total is " +dt + ".");
            System.out.println();
        }

        if (dt > 21){                                                                                                   //dealer busts
            System.out.println("\nDealer busts (got a total over 21), YOU WIN!");
            System.exit(0);
        }
        System.out.println();
        System.out.println("Dealer stays.");
        System.out.println();

        System.out.println("Your total is " +pt +".");                                                                  //result
        System.out.println("Dealer total is " +dt +".");

        if ( pt > dt)
            System.out.println("YOU WIN THIS ROUND!");
        else if (dt >= pt)
            System.out.println("YOU LOSE! DEALER WINS THIS ROUND!");


    }

}

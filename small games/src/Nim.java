import java.util.Scanner;
import java.util.Random;

public class Nim {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();

        int pile1 = 3+rng.nextInt(4);
        int pile2 = 3+rng.nextInt(4);
        int pile3 = 3+rng.nextInt(4);

        String player1;
        String player2;

        System.out.println("NIM!");
        System.out.println("1. Player 1 picks a pile, then removes one or more counters from the pile.");
        System.out.println("2. Player 2 does the same.");
        System.out.println("3. Player 1 plays again.");
        System.out.println("4. Whichever player is forced to take the last counter loses the game.");
        System.out.println();
        System.out.println();
        System.out.print("Player 1, enter your name: ");
        player1 = keyboard.next();
        System.out.print("Player 2, enter your name: ");
        player2 = keyboard.next();
        System.out.println();

        do{
            System.out.println("A: " + pile1 + "\tB: " + pile2 + "\tC: " + pile3);
            System.out.println();
            System.out.print(player1 +", choose a pile: ");
            String choose = keyboard.next();
            System.out.print("How many to remove from pile " + choose + ": ");
            int remove = keyboard.nextInt();

            if ( choose.equals("A"))
                pile1 = (pile1 - remove);
            else if (choose.equals("B"))
                pile2 = (pile2 - remove);
            else if (choose.equals("C"))
                pile3 = (pile3 - remove);

            System.out.println();
            System.out.println("A: " + pile1 + "\tB: " + pile2 + "\tC: " +pile3);
            System.out.println();
            if (pile1 == 0 && pile2 == 0 && pile3 == 0){
                System.out.println(player1 + ", there are no counters left, so you LOSE!");
                System.exit(0);
            }
            System.out.print(player2 + ", choose a pile: ");
            choose = keyboard.next();
            System.out.print("How many to remove from Pile " + choose + ": ");
            remove = keyboard.nextInt();

            if ( choose.equals("A"))
                pile1 = (pile1 - remove);
            else if (choose.equals("B"))
                pile2 = (pile2 - remove);
            else if (choose.equals("C"))
                pile3 = (pile3 - remove);

            System.out.println();
            if (pile1 == 0 && pile2 == 0 && pile3 == 0) {
                System.out.println(player2 + ", there are no counters left, so you LOSE!");
                System.exit(0);
            }



        }while (pile1 > 0 || pile2 > 0 || pile3 > 0);
    }
}
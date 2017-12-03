import java.util.Random; import java.util.Scanner;

public class Exc7_7 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int ace = 1 + r.nextInt(3);
        int guess;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println( "\t\t##\t##\t##");
        System.out.println( "\t\t##\t##\t##");
        System.out.println( "\t\t1 \t2 \t3 ");
        System.out.print("\n> ");
        guess = keyboard.nextInt();
        System.out.println();

        if ( guess == ace)
            System.out.println("You nailed it! Fast Eddie relictantly hands over your winning. scowling.");
        else if ( guess != ace)
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace + ".");
        if ( ace == 1){
            System.out.println();
            System.out.println( "\t\tAA\t##\t##");
            System.out.println( "\t\tAA\t##\t##");
            System.out.println( "\t\t1 \t2 \t3 ");
        }
        else if ( ace == 2){
            System.out.println();
            System.out.println( "\t\t##\tAA\t##");
            System.out.println( "\t\t##\tAA\t##");
            System.out.println( "\t\t1 \t2 \t3 ");
        }
        else if ( ace == 3) {
            System.out.println();
            System.out.println("\t\t##\t##\tAA");
            System.out.println("\t\t##\t##\tAA");
            System.out.println("\t\t1 \t2 \t3 ");
        }

    }
}

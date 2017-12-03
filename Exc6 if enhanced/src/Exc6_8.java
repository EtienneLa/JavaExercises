import java.util.Scanner;

public class Exc6_8 {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        int hidden = 8;
        int input;

        System.out.print("I'm thinking of a number from 1-10. Try a guess! ");
        input = keyboard.nextInt();

        if ( input == hidden){

            System.out.print("\nWow, that's right! It was " + hidden + "!");
        }
        else {

            System.out.print("\nSorry, incorrect! It was " + hidden + "!");
        }
    }


}

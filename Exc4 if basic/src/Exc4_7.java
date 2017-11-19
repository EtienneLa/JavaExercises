import java.util.Scanner;

public class Exc4_7 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        int result, ans;
        result = 0;

        System.out.print("Yor're there?! ");
        keyboard.next();

        System.out.print("\nQ1) What is the capital of Alaska?\n    1) Melbourne\n    2) Anchorage\n    3) Juneau");

        System.out.print("\n>");
        ans = keyboard.nextInt();

        if ( ans == 3){

            System.out.print("\nThat's right!\n");
            result += 1;
        }
        else{

            System.out.print("\nIncorrect\n");
        }

        System.out.print("\nQ2) Can you store the value 'cat' in a variable of type int?\n    1) yes\n    2) no");

        System.out.print("\n>");
        ans = keyboard.nextInt();

        if ( ans == 2){

            System.out.print("\nThat's right!\n");
            result += 1;
        }
        else{

            System.out.print("\nIncorrect\n");
        }

        System.out.print("\nQ3) What is the result of 9+6/3?\n    1) 5\n    2) 11\n    3) 15/3");

        System.out.print("\n>");
        ans = keyboard.nextInt();

        if ( ans == 2 ){

            System.out.print("\nThat's right!\n");
            result += 1;
        }
        else{

            System.out.print("\nIncorrect\n");
        }

        System.out.print("\nYou got " + result + " out of 3 correct.\nThanks for playing!");

    }
}

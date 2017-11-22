import java.util.Scanner;

public class Exc8_9 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me until u add 0.");
        System.out.print("Your number: ");
        int in = keyboard.nextInt();
        int sum = in;
        System.out.println("The total so far is " + sum);

        while ( in != 0 ){

            System.out.print("Your number: ");
            in = keyboard.nextInt();
            sum = sum+in;
            System.out.println("The total is " + sum);

        }

    }
}

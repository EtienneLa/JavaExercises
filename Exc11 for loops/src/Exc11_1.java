import java.util.Scanner;

public class Exc11_1 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.next();

        for ( int n = 1 ; n <= 5 ; n = n+1)
            System.out.println(n + ". " + message);
    }
}

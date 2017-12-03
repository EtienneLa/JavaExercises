import java.util.Scanner;

public class Exc8_4 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and i'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        int n = 0;
        while ( n < 5){
            System.out.println(n+1 + "." + message);
            n++;
        }
    }
}

import java.util.Scanner;

public class Exc8_5 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, i'll display it several times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.print("How many times? ");
        int re = keyboard.nextInt();

        int n = 0;

        while ( n < re){
            System.out.println(((1+n)*10) + "." + " " + message);
            n++;
        }
    }
}

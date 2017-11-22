import java.util.Scanner;

public class Exc8_6 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxtries = 3;

        System.out.println("WELCOME TO YOUR BANK.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;
        while ( entry != pin && tries < maxtries){
            System.out.println("INCORRECT. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }
        if ( entry == pin)
            System.out.println("ACCEPTED.");
        else if (tries >= maxtries)
            System.out.println("YOR HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}

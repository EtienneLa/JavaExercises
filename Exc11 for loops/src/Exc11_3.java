import java.util.Scanner;

public class Exc11_3 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Count from: ");
        int cfrom = keyboard.nextInt();
        System.out.print("Count to: ");
        int cto = keyboard.nextInt();
        System.out.print("Count by: ");
        int cby = keyboard.nextInt();

        for ( int n = cfrom; n != cto+cby; n=n+cby) {
            System.out.print(n + " ");
        }
    }
}

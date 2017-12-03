import java.util.Scanner;

public class Exc6_7 {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        String name; String a = "Aaaaaaaaaaaaaaaaaa";
        int rollcall;

        System.out.println("What is your last name? ");
        name = keyboard.next();
        rollcall=name.compareTo(a);

        if ( rollcall <= 2){
            System.out.print("\nYou don't have to wait long, '" + name + "'.");
        }
        else if (rollcall <= 9){
            System.out.print("\nYou don't have to wait too long, '" + name + "'.");
        }
        else if (rollcall <= 18){
            System.out.print("\nIt looks like a bit of wait, '" + name + "'.");
        }
        else if (rollcall <= 24){
            System.out.print("\nYou have to wait for a while, '" + name + "'.");
        }
        else {
            System.out.print("\nYou're not going anywhere for a long time, '" + name + "'.");
        }
    }
}

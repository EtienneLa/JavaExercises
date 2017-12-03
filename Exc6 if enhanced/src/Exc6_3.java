import java.util.Scanner;

public class Exc6_3 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String place;
        String status;
        String ph;
        ph = "both";

        System.out.println("Think of something and i'll try to guess it!");
        System.out.print("\nQuestion 1) Does it stay inside or outside or both? > ");
        place = keyboard.next();
        System.out.print("\nQuestion 2) Is it a living thing? > ");
        status = keyboard.next();

        if ( place.equals("outside") && status.equals("yes")){
            System.out.println("\nIt is a bison, isn't it?");
        }
        if ( place.equals("outside") && status.equals("no")){
            System.out.println("\nIt is a billboard, isn't it?");
        }
        if ( place.equals(ph) && status.equals("yes")){
            System.out.println("\nIt is a dog, isn't it?");
        }
        if ( place.equals(ph) && status.equals("no")){
            System.out.println("\nIt is a cell phone, isn't it?");
        }
        if ( place.equals("inside") && status.equals("yes")){
            System.out.println("\nIt is a houseplant, isn't it?");
        }
        if ( place.equals("inside") && status.equals("no")){
            System.out.println("\nIt is a shower curtain, isn't it?");
        }
    }
}

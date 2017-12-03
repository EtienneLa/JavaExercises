import java.util.Scanner;

public class Exc6_2 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Your name: ");
        name = keyboard.next();
        System.out.print("Your age: ");
        age = keyboard.nextInt();

        if ( age >= 25){
            System.out.println("\nYou can do pretty much anything, " + name + ".");
        }
        if ( age >= 18 && age <= 24){
            System.out.println("\nYou can vote but not rent a car, " + name + ".");
        }
        if ( age == 16 || age == 18){
            System.out.println("\nYou can drive but not vote, " + name + ".");
        }
        if (age <= 16){
            System.out.println("\nYou can not drive, " + name + ".");
        }
    }
}

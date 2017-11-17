import java.util.Scanner;

public class Exc4_5 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hey, what's your name? ");
        name = keyboard.next();

        System.out.println("Ok, " +name +", how old are you? ");
        age = keyboard.nextInt();

        if ( age >= 25){
            System.out.println("\nYou can do pretty much anything, "+name+".");
        }
        else if ( age >= 18){
            System.out.println("\nYou can vote but not rent a car, "+name+".");
        }
        else if ( age >= 16){
            System.out.println("\nYou can drive but not vote, "+name+".");
        }
        else{
            System.out.println("\nYou can not drive, "+name+".");

        }
    }
}

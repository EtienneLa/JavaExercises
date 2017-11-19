import java.util.Scanner;

public class Exc4_2 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hey, what's your name? ");
        name = keyboard.next();
        System.out.println("Hey " + name + ", how old are you? ");
        age = keyboard.nextInt();

        if (age < 16){

            System.out.println("You can not drive, " + name + ".");
        }

        if (age < 18){

            System.out.println("You can not vote, " + name + ".");
        }

        if (age < 25){

            System.out.println("You can not rent a car, " + name + ".");
        }

        if (age > 25){

            System.out.println(name + ", you can do anything that's legal!");
        }
    }
}

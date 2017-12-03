import java.util.Scanner;

public class Exc6_5 {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        String gender;
        String name1;
        String name2;
        int age;
        String married;

        System.out.print("What is your gender? (M or F): ");
        gender = keyboard.next();
        System.out.print("First name: ");
        name1 = keyboard.next();
        System.out.print("Last name: ");
        name2 = keyboard.next();
        System.out.print("Age: ");
        age = keyboard.nextInt();

        if ( age < 20 ){
            System.out.print("\nThen i shall call you " + name1 + " " + name2 +".");
        }
        else {
            if (gender.equals("M")){
                System.out.print("\nThen i shall call your Mr. " + name2 + ".");
            }
            else if ( gender.equals("F")){
                System.out.print("\nAre you married, " + name1 +" (y or n)? ");
                married = keyboard.next();
                if (married.equals("y")){
                    System.out.print("\nThen i shall call you Mrs. " +name2 + ".");
                }
                else if (married.equals("n")){
                    System.out.print("\nThen i shall call you Ms. " + name2 + ".");
                }
            }
        }

    }
}

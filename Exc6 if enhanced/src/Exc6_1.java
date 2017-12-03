import java.util.Scanner;

public class Exc6_1 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        String type, size;

        System.out.println("TWO QUESTIONS!");
        System.out.println("\nThink of an item, i'll try to guess it.");
        System.out.println("\nQ1) Is it a vegetable, animal or mineral?");
        System.out.print("> ");
        type = keyboard.next();
        System.out.println("\nQ2) Is it bigger than a breadbox?");
        System.out.print("> ");
        size = keyboard.next();

        if (type.equals("vegetable")){
                if (size.equals("yes")){
                    System.out.print("\n\nI guess it is a pumpkin!");
                }
                else if ( size.equals("no") ){
                    System.out.print("\n\nI guess it is a carrot!");
                }
        }
        else if (type.equals("animal")){
                if (size.equals("yes")){
                    System.out.print("\n\nI guess it is an elephant!");
                }
                else if (size.equals("no")){
                    System.out.print("\n\nI guess it is a mouse!");
                }
        }
        else if (type.equals("mineral")){
                if (size.equals("yes")){
                    System.out.print("\n\nI guess it is a truck!");
                }
                else if (size.equals("no")){
                    System.out.print("\n\nI guess it is a pen");
            }
        }

    }
}

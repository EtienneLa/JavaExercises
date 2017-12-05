import java.util.Scanner;

public class Exc13_10{

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        int select = 0, currentkeys = 0;

        System.out.println("Keychain Shop");

        while (select != 4){

            System.out.println();
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println();
            System.out.print("Please enter your choice: ");
            select = kb.nextInt();

            if (select == 1){

                currentkeys = add_keychains(currentkeys);
            }
            else if (select == 2){

                currentkeys = remove_keychains(currentkeys);
            }
            else if (select == 3){

                current_keychains(currentkeys);
            }
        }

        System.out.println();
        System.out.print("What is your name? ");
        String name = kb.next();
        current_keychains(currentkeys);
        System.out.println("Thanks for your order, " + name + "!");

    }

    public static Integer add_keychains(int currentkeys){

        Scanner kb = new Scanner(System.in);

        System.out.println();
        System.out.print("You have " + currentkeys + ". How many to add? ");
        int addkeys = kb.nextInt();
        currentkeys = currentkeys + addkeys;
        System.out.println("You now have " + currentkeys + ".");

        return currentkeys;
    }

    public static Integer remove_keychains(int currentkeys){

        Scanner kb = new Scanner(System.in);

        if ( currentkeys > 0) {
            System.out.println();
            System.out.print("You have " + currentkeys + ". How many to remove? ");
            int removekeys = kb.nextInt();
            currentkeys = currentkeys - removekeys;
            System.out.println("You now have " + currentkeys + ".");
        }
        else {
            System.out.println();
            System.out.println("You don't have keys to remove.");
        }

        return currentkeys;
    }

    public static void current_keychains(int currentkeys){

        int price = 10;

        System.out.println();
        System.out.println("You have " + currentkeys + ".");
        System.out.println("Keychains cost " + price + "$ each.");
        System.out.println("Total cost is " +  currentkeys * price + "$.");
    }
}
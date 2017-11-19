import java.util.Scanner;

public class Exc4_6 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        int input;
        double weight;
        double Venus, Mars, Jupiter, Saturn, Uranus, Nepturne;
        Venus = 0.78; Mars = 0.39; Jupiter = 2.65; Saturn = 1.17; Uranus = 1.05; Nepturne = 1.23;

        System.out.println("Enter your current weight on earth: ");
        weight = keyboard.nextDouble();

        System.out.println("\nI have information for the following planets:" + "\n   1. Venus    2. Mars    3. Jupiter");
        System.out.println("   4. Saturn   5. Uranus  6. Nepturne");

        System.out.println("\nWhich planet are you visiting? ");
        input = keyboard.nextInt();

        if (input == 1){

            System.out.println("\nYour weight would be "+ (weight*Venus) + " on that planet");
        }
        if (input == 2){

            System.out.println("\nYour weight would be "+ (weight*Mars) + " on that planet");
        }
        if (input == 3){

            System.out.println("\nYour weight would be "+ (weight*Jupiter) + " on that planet");
        }
        if (input == 4){

            System.out.println("\nYour weight would be "+ (weight*Saturn) + " on that planet");
        }
        if (input == 5){

            System.out.println("\nYour weight would be "+ (weight*Uranus) + " on that planet");
        }
        if (input == 6){

            System.out.println("\nYour weight would be "+ (weight*Nepturne) + " on that planet");
        }
        else{

            System.out.println("Please enter the right number.");
        }

    }
}

import java.util.Scanner;
import java.util.Random;

public class Exc17_10 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random rng = new Random();
        int found = 0;

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            int r = 1 + rng.nextInt(50);
            array[i] = r;
        }
        System.out.print("Value to find: ");
        int find = kb.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (find == array[i]) {

                found = found + 1;
                System.out.println("\n" + find + " is in slot " + i);
            }
        }
        if (found != 0)
            System.out.println("\n" + find + " was found " + found + " times.");
        else
            System.out.println("\n" + find + " is not in the array.");

        System.out.print("\nArray:");

        for (int i = 0; i < array.length; i++) {

            System.out.print(" " + array[i]);
        }
    }
}
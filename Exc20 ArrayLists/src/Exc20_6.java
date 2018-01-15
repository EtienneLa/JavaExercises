import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exc20_6 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0; i < 10; i++ ) {
            int r = 1 + rng.nextInt(50);
            list.add(r);
        }
        System.out.println("ArrayList: " + list);
        System.out.println();
        System.out.print("Value to find: ");
        Scanner kb = new Scanner(System.in);
        int find = kb.nextInt();

        int check = 0;

        for ( int i = 0; i < list.size(); i++ ) {
            if ( list.get(i) == find ) {
                System.out.println("Slot " + i + " contains " + find + ".");
                check = 1;
            }
        }
        if ( check != 1)
            System.out.println(find + " is not in the ArrayList.");
    }
}

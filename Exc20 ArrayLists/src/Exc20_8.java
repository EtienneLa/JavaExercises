import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Exc20_8 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0; i < 20; i++ ) {
            int r = 1 + rng.nextInt(99);
            list.add(r);
        }

        System.out.print("ArrayList before: ");
        for ( int counter: list)
            System.out.print(counter + " ");
        System.out.println();

        Collections.sort(list);

        System.out.print("ArrayList after: ");
        for ( int counter: list)
            System.out.print(counter + " ");

    }
}

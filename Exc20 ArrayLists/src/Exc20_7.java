import java.util.Random;
import java.util.ArrayList;

public class Exc20_7 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);

        for ( int i = 0; i < 10; i++ ) {
            int r = 1 + rng.nextInt(100);
            list.add(r);
        }

        System.out.println("ArrayList: " + list);
        System.out.println();

        int largest = 0, slot = 0;

        for ( int i = 0; i < list.size(); i++ ) {
            if ( list.get(i) > largest ) {
                largest = list.get(i);
                slot = i;
            }
        }

        System.out.println("The largest value is " + largest + ", which is in slot " + slot + ".");
    }
}

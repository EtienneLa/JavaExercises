import java.util.ArrayList;
import java.util.Random;

public class Exc20_3 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0; i < 10; i++ ) {
            int r = 1 + rng.nextInt(100);
            list.add(r);
        }
        System.out.println("List: " + list);
    }
}

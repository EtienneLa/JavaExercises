import java.util.ArrayList;
import java.util.Random;

public class Exc20_4 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0; i < 1000; i++ ) {
            int r = 10 + rng.nextInt(89);
            list.add(r);
        }
        System.out.println(list);
    }
}

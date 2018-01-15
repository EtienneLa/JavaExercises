import java.util.Random;
import java.util.ArrayList;

public class Exc20_5 {

    public static void main( String[] args ) {

        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0; i < 10; i++ ) {
            int r = 1 + rng.nextInt(100);
            list.add(r);
        }
        ArrayList<Integer> list2 = new ArrayList<>(list);

        list.set(9, -7);

        System.out.println(list);
        System.out.println(list2);
    }
}

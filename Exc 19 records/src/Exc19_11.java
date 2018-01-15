import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;

public class Exc19_11 {

    public static void main( String[] args ) throws FileNotFoundException, NullPointerException {

        Cars[] cars = new Cars[5];

        System.out.print("From which file do you want to load this information? ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);
        System.out.println();

        for ( int i = 0; i < cars.length; i++ ) {
            cars[i] = new Cars();
            cars[i].make = filesc.next();
            cars[i].model = filesc.next();
            cars[i].year = filesc.nextInt();
            cars[i].license = filesc.next();
        }
        filesc.close();

        make_sort( cars );

        for ( int i = 0; i < cars.length; i++ ) {
            System.out.println("Car " + (i+1) + ": " + cars[i]);
        }
    }

    public static void make_sort ( Cars[] cars ) {

        int i, j;
        Cars temp;

        for ( i = 0; i < cars.length - 1; i++ ) {
            for ( j = i+1; j < cars.length; j++ )
                if ( cars[i].make.compareTo(cars[j].make) > 0 ) {
                    temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }

        }
    }
}

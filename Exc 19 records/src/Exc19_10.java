import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Exc19_10 {

    public static void main( String[] args ) throws FileNotFoundException {

        Cars[] cars = new Cars[5];

        System.out.print("Which file to open? ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);

        for ( int i = 0; i < cars.length; i++ ) {
            cars[i] = new Cars();
            cars[i].make = filesc.next();
            cars[i].model = filesc.next();
            cars[i].year = filesc.nextInt();
            cars[i].license = filesc.next();
        }
        System.out.println("\nBefore sorting:");

        for ( int i = 0; i < cars.length; i++ ) {
            System.out.println("\nCar " + (i+1) + ":" + cars[i]);
        }

        year_sort( cars );

        System.out.println("\nAfter sorting:");

        for ( int i = 0; i < cars.length; i++ ) {
            System.out.println("\nCar " + (i+1) + ":" + cars[i]);
        }
    }

    public static void year_sort( Cars[] cars ) {

        int i, j, min;
        Cars temp;

        for ( i = 0; i < cars.length - 1; i ++ ) {
            min = i;
            for ( j = i + 1; j < cars.length; j++ )
                if ( cars[j].year < cars[min].year )
                    min = j;
            if ( min != i ) {
                temp = cars[i];
                cars[i] = cars[min];
                cars[min] = temp;
            }
        }
    }
}
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Cars {

    String make;
    String model;
    int year;
    String license;

    public String toString() {
        return "\n\tMake: " + make + "\n\tModel: " + model + "\n\tYear: " + year + "\n\tLicense: " + license;
    }
}

public class Exc19_9 {

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
        System.out.println();

        for ( int i = 0; i < cars.length; i++ ) {
            System.out.println("Car " + (i+1) + ":" + cars[i]);
        }
    }
}

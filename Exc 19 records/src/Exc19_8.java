import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

class Car {

    String make;
    String model;
    int year;
    String license;

    public String toString() {
        return make + "\t" + model + "\t" + year + "\t" + license + "\n";
    }
}

public class Exc19_8 {

    public static void main( String[] args ) throws FileNotFoundException {

        Car cars[] = new Car[5];
        Scanner kb = new Scanner(System.in);

        for ( int i = 0; i < cars.length; i++ ) {
            cars[i] = new Car();

            System.out.println("Car " + (i+1));
            System.out.print("\t\tMake: ");
            cars[i].make = kb.next();
            System.out.print("\t\tModel: ");
            cars[i].model = kb.next();
            System.out.print("\t\tYear: ");
            cars[i].year = kb.nextInt();
            System.out.print("\t\tLicense: ");
            cars[i].license = kb.next();
            System.out.println();
        }

        System.out.print("To which file do you want to save this information? ");
        String filename = kb.next();
        PrintWriter write = new PrintWriter(filename);

        for ( int i = 0; i < cars.length; i++ ) {
            write.println(cars[i]);
        }
        write.close();
    }
}

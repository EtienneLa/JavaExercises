import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Exc20_10 {

    public static void main( String[] args ) throws FileNotFoundException {

        ArrayList<Car> cars = new ArrayList<>();

        System.out.print("From which file do you want to load this information? ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);

        while (filesc.hasNext()) {
            Car car = new Car();
            car.make = filesc.next();
            car.model = filesc.next();
            car.year = filesc.nextInt();
            car.license = filesc.next();

            cars.add(car);
        }

        Sorting( cars );

        System.out.println(cars);

    }

    public static void Sorting( ArrayList<Car> cars ) {

        int swap;

        for ( int i = 0; i < cars.size() - 1; i++ ) {
            swap = i;
            for (int j = i + 1; j < cars.size(); j++)
                if ( )

        }
    }
}

class Car {

    String make;
    String model;
    int year;
    String license;

    public String toString() {
        return year + " " + make + " " + model + " (" + license + ")";
    }
}

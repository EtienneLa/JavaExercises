import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Person {

    String name;
    int age;

    public String toString() {
        return name + " is " + age;
    }
}

public class Exc19_7 {

    public static void main( String[] args ) throws FileNotFoundException {

        Person[] person = new Person[5];

        System.out.print("Which file to open: ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);

        System.out.println();

        for ( int i = 0; i < person.length; i++ ) {

            person[i] = new Person();
            person[i].name = filesc.next();
            person[i].age = filesc.nextInt();
            System.out.println(person[i]);
        }
        filesc.close();
    }
}

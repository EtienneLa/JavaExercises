import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exc19_6 {

    public static void main( String[] args ) throws FileNotFoundException {

        Scanner kb = new Scanner(System.in);
        String filename;

        Dog first = new Dog();
        Dog second = new Dog();

        System.out.print("Which file to open: ");
        filename = kb.next();
        File file = new File(filename);
        Scanner filesc = new Scanner(file);

        first.breed = filesc.next();
        first.age = filesc.nextInt();
        first.weight = filesc.nextInt();

        second.breed = filesc.next();
        second.age = filesc.nextInt();
        second.weight = filesc.nextInt();

        filesc.close();

        System.out.println("First dog: " + first);
        System.out.println("Second dog: " + second);


    }
}
class Dog {

    String breed;
    int age;
    int weight;

    public String toString() {
        return breed + ", " + age + ", " + weight;
    }
}

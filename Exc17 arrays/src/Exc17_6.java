import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Exc17_6 {

    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);
        Random rng = new Random();

        System.out.print("Name (first last): ");
        String name = kb.nextLine();

        PrintWriter writer = new PrintWriter("grades.txt");

        System.out.println("\nHere are your randomly generated grades (hope you pass):");

        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {

            int r = 1 + rng.nextInt(100);
            grades[i] = r;
            System.out.println("Grade " + (i+1) + ": " + grades[i]);
        }
        writer.println(name);

        for ( int i = 0; i < grades.length; i++) {

            writer.print(grades[i] + " ");
        }

        writer.close();
    }
}

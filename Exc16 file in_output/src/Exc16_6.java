import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Exc16_6 {

    public static void main( String[] args ) throws Exception {

        Scanner kb = new Scanner(System.in);
        String filename;

        System.out.print("Choose a file to scan (num1.txt, num2.txt, num3.txt): ");
        filename = kb.next();

        BufferedReader read = new BufferedReader( new FileReader( filename));

        int num1 = Integer.parseInt(read.readLine());
        int num2 = Integer.parseInt(read.readLine());
        int num3 = Integer.parseInt(read.readLine());

        System.out.println("\n" + num1 + "+" + num2 + "+" + num3 + "=" + (num1+num2+num3));
    }
}

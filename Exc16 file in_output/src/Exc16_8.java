import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Exc16_8 {

    public static void main(String[] args) throws Exception{

        Scanner kb = new Scanner(System.in);

        System.out.print("Which file to read number from: ");
        String file = kb.nextLine();

        BufferedReader read = new BufferedReader(new FileReader(file));
        String scan = read.readLine();
        int num, num2 = 0;

        while (scan != null){

            num = Integer.parseInt(scan);

            System.out.print(num + " ");

            num2 += num;

            scan = read.readLine();
        }

        System.out.println("\nThe total is " + num2);
    }
}

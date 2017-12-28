import java.util.Scanner;
import java.io.*;

public class Exc16_10 {

    public static void main(String[] args) throws Exception {

        Scanner kb = new Scanner(System.in);

        System.out.println("Open which file: ");
        String filename = kb.next();

        BufferedReader read = new BufferedReader( new FileReader(filename));

        String text = read.readLine();

        int y = 2;

        while( y <= text.length()){

            char c = text.charAt(y);

            System.out.print(c);

            y += 3;
        }
        read.close();
    }
}

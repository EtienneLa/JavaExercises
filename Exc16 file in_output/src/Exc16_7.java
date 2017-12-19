import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Exc16_7 {

    public static void main(String[] args) throws Exception{

        Scanner kb = new Scanner(System.in);
        String file;

        System.out.print("Which file to open: ");
        file = kb.next();

        BufferedReader read = new BufferedReader(new FileReader(file));
        String line = read.readLine();

        while (line != null){

            System.out.println(line);
            line = read.readLine();
        }
    }
}

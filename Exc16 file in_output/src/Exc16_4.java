import java.io.BufferedReader;
import java.io.FileReader;

public class Exc16_4 {

    public static void main( String [] args ) throws Exception{

        BufferedReader read = new BufferedReader(new FileReader("name.txt"));

        String name = read.readLine();

        System.out.println("Your name is " + name + ".");
    }
}

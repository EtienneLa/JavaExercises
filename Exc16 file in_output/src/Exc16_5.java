import java.io.BufferedReader;
import java.io.FileReader;

public class Exc16_5 {

    public static void main( String [] args ) throws Exception {

        BufferedReader r = new BufferedReader( new FileReader("3nums.txt"));

        int num1 = Integer.parseInt(r.readLine());
        int num2 = Integer.parseInt(r.readLine());
        int num3 = Integer.parseInt(r.readLine());

        System.out.println(num1 + "+" + num2 + "+" + num3 +"=" + (num1+num2+num3));
    }
}

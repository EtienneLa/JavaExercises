import java.net.URL;
import java.util.Scanner;

public class Exc16_9 {

    public static void main(String[] args) throws Exception{

        URL mcool = new URL ("http://cs.leanderisd.org/mitchellis.txt");
        Scanner webIn = new Scanner( mcool.openStream() );

        String str = webIn.nextLine();

        while( webIn.nextLine() != null){
            System.out.println(str);
        }
        webIn.close();
    }
}

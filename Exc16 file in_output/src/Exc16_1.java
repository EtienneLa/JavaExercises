import java.io.*;

public class Exc16_1 {

    public static void main( String[] args) throws Exception {

        String str = "Hello";

        BufferedWriter writer = new BufferedWriter( new FileWriter("Hello") );

        writer.write("Hello, what's up?");
        writer.write(str);

        writer.close();
    }
}

import java.io.*;

public class Exc16_2 {

    public static void main( String [] args ) throws IOException {

        PrintWriter out = new PrintWriter("Letter.txt");

        out.println("+-------------------------------------------------------------------+");
        out.println("I                                                            #######I");
        out.println("I                                                            #######I");
        out.println("I                                                            #######I");
        out.println("I                                                                   I");
        out.println("I                                                                   I");
        out.println("I                                                                   I");
        out.println("I                                                                   I");
        out.println("I                                                                   I");
        out.println("I                                                 Hier könnte ihre  I");
        out.println("I                                                 Adresse           I");
        out.println("I                                                 stehen            I");
        out.println("I                                                                   I");
        out.println("+-------------------------------------------------------------------+");

        out.close();

    }
}

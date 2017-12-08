import java.util.Scanner;

public class Exc15_3 {

    public static void main( String[] args ) throws Exception{

        Scanner kb = new Scanner(System.in);

        System.out.print("Which base (2-10: ");
        int b = kb.nextInt();

        for ( int thous = 0; thous < b; thous++ ){

            for ( int hund = 0; hund < b; hund++ ){

                for ( int tens = 0; tens < b; tens++ ){

                    for ( int ones = 0; ones < b; ones++ ){

                        System.out.print( thous + "" + hund + "" + tens + "" + ones + "\n");
                        Thread.sleep(500);
                    }
                }
            }
        }
        System.out.println();
    }
}
public class Exc15_6 {

    public static void main( String[] args ) {

        for ( int tens = 1; tens <= 9; tens++ ) {

            for ( int ones = 0; ones <= 9; ones++ ) {

                System.out.println(tens + "" + ones + ", " + tens + "+" + ones + " = " + (tens+ones));
            }
        }
    }
}

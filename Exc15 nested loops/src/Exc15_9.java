public class Exc15_9 {

    public static void main( String[] args ) {

        for ( int n = 10; n <= 50; n++ ) {

            for ( int x = 10; x <= 50; x++ ) {

                if ( n+x == 60 && n-x == 14 | x-n == 14 )
                    System.out.println( n + ", " + x );
            }
        }
    }
}

public class Exc15_8 {

    public static void main( String[] args ) {

        System.out.println("x | 1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("==+=====================================");

        for ( int n = 1; n <= 12; n++ ) {

            if ( n < 10)
                System.out.print(n + " | ");
            else
                System.out.print(n + "| ");

            for ( int x = 1; x <= 9; x++ ) {

                System.out.print(n*x + "\t");
            }
            System.out.println();
        }
    }
}

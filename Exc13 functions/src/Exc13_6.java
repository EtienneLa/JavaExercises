public class Exc13_6 {

    public static Integer getOffset( int month){

        int offset;

        if ( month == 1 )
            offset = 1;

        else if ( month == 2 )
            offset = 4;

        else if ( month == 3)
            offset = 4;

        else if ( month == 4)
            offset = 0;

        else if ( month == 5)
            offset = 2;

        else if ( month == 6)
            offset = 5;

        else if ( month == 7)
            offset = 0;

        else if ( month == 8)
            offset = 3;

        else if ( month == 9 )
            offset = 6;

        else if ( month == 10)
            offset = 1;

        else if ( month == 11)
            offset = 4;

        else if ( month == 12)
            offset = 6;

        else
            offset = -1;


        return offset;
    }

    public static void main( String[] args){

        System.out.println( "Offset for month 1: " + getOffset(1) );
        System.out.println( "Offset for month 2: " + getOffset(2) );
        System.out.println( "Offset for month 3: " + getOffset(3) );
        System.out.println( "Offset for month 4: " + getOffset(4) );
        System.out.println( "Offset for month 5: " + getOffset(5) );
        System.out.println( "Offset for month 6: " + getOffset(6) );
        System.out.println( "Offset for month 7: " + getOffset(7) );
        System.out.println( "Offset for month 8: " + getOffset(8) );
        System.out.println( "Offset for month 9: " + getOffset(9) );
        System.out.println( "Offset for month 10: " + getOffset(10) );
        System.out.println( "Offset for month 11: " + getOffset(11) );
        System.out.println( "Offset for month 12: " + getOffset(12) );
        System.out.println( "Offset for month 43: " + getOffset(43) );


    }
}

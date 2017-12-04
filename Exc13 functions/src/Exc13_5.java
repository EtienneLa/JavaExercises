public class Exc13_5 {

    public static void main( String[] args){

        for( int monthnum = 1; monthnum <= 12; monthnum++ )

            System.out.println("Month " + monthnum + ": " + month_name(monthnum));
    }

    public static String month_name( int num ){

        String name;

        if( num == 1 )
            name = "January";

        else if( num == 2 )
            name = "February";

        else if( num == 3 )
            name = "March";

        else if( num == 4 )
            name = "April";

        else if( num == 5 )
            name = "May";

        else if( num == 6 )
            name = "June";

        else if( num == 7 )
            name = "July";

        else if( num == 8 )
            name = "August";

        else if( num == 9 )
            name = "September";

        else if( num == 10 )
            name = "October";

        else if( num == 11 )
            name = "November";

        else if( num == 12 )
            name = "December";

        else
            name = "error";

        return name;

    }
}

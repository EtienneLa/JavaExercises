public class Month_Name {

    public static String month_name( int mm ){

        String name;

        if( mm == 1 )
            name = "January";

        else if( mm == 2 )
            name = "February";

        else if( mm == 3 )
            name = "March";

        else if( mm == 4 )
            name = "April";

        else if( mm == 5 )
            name = "May";

        else if( mm == 6 )
            name = "June";

        else if( mm == 7 )
            name = "July";

        else if( mm == 8 )
            name = "August";

        else if( mm == 9 )
            name = "September";

        else if( mm == 10 )
            name = "October";

        else if( mm == 11 )
            name = "November";

        else if( mm == 12 )
            name = "December";

        else
            name = "error";

        return name;

    }
}

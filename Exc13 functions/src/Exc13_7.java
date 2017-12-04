import java.util.Scanner;
import java.lang.*;

public class Exc13_7 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to my birth-o-meter!");
        System.out.println("\nAll you have to do is enter your birthday, and it will tell you");
        System.out.println("the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests..");
        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
        System.out.println("2 13 1976 => " + weekday(2, 13, 1976));
        System.out.println("2 13 1977 => " + weekday(2, 13, 1977));
        System.out.println("7  2 1974 => " + weekday(7, 2, 1974));
        System.out.println("1 15 2003 => " + weekday(1, 15, 2003));
        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
        System.out.println();
        System.out.println("Now it's your turn! What's your birthday?");
        System.out.print("Birthday (mm-dd-yyyy): ");

        String birthday = kb.next();                                                                                    //split[] um die ints mit Integer.parseInt(split[]) aus dem String zu bekommen
        String split[] = birthday.split("-");
        int mm = Integer.parseInt(split[0]);
        int dd = Integer.parseInt(split[1]);
        int yyyy = Integer.parseInt(split[2]);

        System.out.println();
        System.out.println("You were born on " + weekday( mm, dd, yyyy ));


    }

    public static String weekday(int mm, int dd, int yyyy) {

        String date;

        int yy = yyyy - 1900;
        int total = yy / 4;
        total += yy + dd + getOffset( mm );

        if ( is_leap( yyyy ) == 1 && mm <= 2){

            total = total - 1;
        }

        int weekday = total % 7;

        String day = weekday_name( weekday );

        date = day + ", " + month_name( mm ) + " " + dd + ", " + yyyy;

        return date;
    }


    public static Integer getOffset( int month ) {

        int offset;

        if (month == 1)
            offset = 1;

        else if (month == 2)
            offset = 4;

        else if (month == 3)
            offset = 4;

        else if (month == 4)
            offset = 0;

        else if (month == 5)
            offset = 2;

        else if (month == 6)
            offset = 5;

        else if (month == 7)
            offset = 0;

        else if (month == 8)
            offset = 3;

        else if (month == 9)
            offset = 6;

        else if (month == 10)
            offset = 1;

        else if (month == 11)
            offset = 4;

        else if (month == 12)
            offset = 6;

        else
            offset = -1;


        return offset;
    }

    public static int is_leap( int year )
    {
        int result;

        if ( year % 400 == 0 )
            result = 1;
        else if ( year % 100 == 0 )
            result = 0;
        else if ( year % 4 == 0 )
            result = 1;
        else
            result = 0;

        return result;
    }

    public static String weekday_name( int weekday ){

        String day = "";

        if ( weekday == 1 )
            day = "Sunday";
        else if ( weekday == 2 )
            day = "Monday";
        else if ( weekday == 3 )
            day = "Tuesday";
        else if ( weekday == 4 )
            day = "Wednesday";
        else if ( weekday == 5 )
            day = "Thursday";
        else if ( weekday == 6 )
            day = "Friday";
        else if ( weekday == 7 || weekday == 0)
            day = "Saturday";

        return day;

    }

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
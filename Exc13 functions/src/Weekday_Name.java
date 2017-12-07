public class Weekday_Name {

    public static String weekday_name( int weekday ) {

        String day = "";

        if (weekday == 1)
            day = "Sunday";
        else if (weekday == 2)
            day = "Monday";
        else if (weekday == 3)
            day = "Tuesday";
        else if (weekday == 4)
            day = "Wednesday";
        else if (weekday == 5)
            day = "Thursday";
        else if (weekday == 6)
            day = "Friday";
        else if (weekday == 7 || weekday == 0)
            day = "Saturday";

        return day;
    }
}

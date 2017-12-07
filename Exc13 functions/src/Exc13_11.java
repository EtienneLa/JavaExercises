import java.util.Scanner;
import java.lang.*;

public class Exc13_11 {

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
        total += yy + dd + GetOffset.getOffset( mm );

        if ( Is_Leap.is_leap( yyyy ) && mm <= 2){

            total = total - 1;
        }

        int weekday = total % 7;

        String day = Weekday_Name.weekday_name( weekday );

        date = day + ", " + Month_Name.month_name( mm ) + " " + dd + ", " + yyyy;

        return date;
    }
}



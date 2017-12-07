public class GetOffset {

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
}

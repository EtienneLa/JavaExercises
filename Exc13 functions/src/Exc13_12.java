public class Exc13_12 {

    public static void main(String[] args){

        for( int i = 1; i <= 20; i++ ){

            System.out.print(i + " ");

            if( isEven(i))
                System.out.print("<");

            if( isDivisibleBy3(i))
                System.out.print("=");

            System.out.println();
        }
    }

    public static boolean isEven( int n){

        boolean result;

        if( n % 2 == 0)
            result = true;

        else
            result = false;

        return result;
    }

    public static boolean isDivisibleBy3( int n){

        boolean result;

        if( n % 3 == 0)
            result = true;

        else
            result = false;

        return result;
    }
}

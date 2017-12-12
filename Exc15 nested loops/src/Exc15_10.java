import java.util.Scanner;

public class Exc15_10 {

    public static void main( String[] args ) {

        Scanner kb = new Scanner(System.in);

        int choice;

        do {

            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit numbers minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.println();
            System.out.print("> ");
            choice = kb.nextInt();


            if ( choice == 1 ) {
                System.out.println(get_first() + " ");
                System.out.println();
            }
            else if ( choice == 2 ) {
                //get_second();
                System.out.println();
            }

        }while ( choice != 3);
    }

    public static String get_first() {

        String result = "";

        for ( int x = 1; x <= 5; x++ ){
            for ( int y = 0; y <= 9; y++ ){

                if ( x + y > 10 ) {

                    result = result + " " + x + "" + y;
                }
            }
        }
        return result;
    }

    //public static String get_second() {


    }
//}

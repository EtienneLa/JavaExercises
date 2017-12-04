import java.util.Random;

public class Exc13_2 {

    public static void main( String[] args) throws InterruptedException{

        Random rng = new Random();
        int r;

        for( int i = 0; i < 100; i++){

            r = 1 + rng.nextInt(5);

            if( r == 1)
                first();
            else if( r == 2)
                second();
            else if( r == 3)
                third();
            else if( r == 4)
                fourth();
            else if( r == 5)
                fifth();

            Thread.sleep(40);
        }

        System.out.println("I pledge allegiance to the flag.");
    }

    public static void first(){

        System.out.println("I                               \r");
    }
    public static void second(){

        System.out.println("  pledge                        \r");
    }
    public static void third(){

        System.out.println("         allegiance             \r");
    }
    public static void fourth(){
        System.out.println("                    to the      \r");
    }
    public static void fifth(){
        System.out.println("                           flag.\r");
    }
}

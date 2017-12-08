import java.util.Scanner;

public class Exc14_1 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        String name;

        System.out.print("What is your name: ");
        name = kb.next();
        System.out.println();

        if ( name.equals("Etienne")){

            for ( int i = 1; i <= 5; i++ )
                System.out.println(name);
        }
        else

            for ( int i = 1; i <= 10; i++ )
                System.out.println(name);
    }
}

import java.util.Scanner;

public class Exc14_2 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        String name;

        System.out.print("What is your name: ");
        name = kb.next();
        System.out.println();

        for ( int i = 1; i <= 10; i++ ){

            if ( name.equals("Etienne")){
                i++;
            }
            System.out.println( name );
        }
    }
}

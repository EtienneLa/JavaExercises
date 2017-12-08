import java.util.Scanner;

public class Exc14_3 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        int num;

        System.out.print("Choose a number: ");
        num = kb.nextInt();

        for ( int i = 1; i <= 12; i++ ){

            System.out.println( num + "x" + i + " = " + ( num * i ));
        }
    }
}

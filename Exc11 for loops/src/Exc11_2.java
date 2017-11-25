import java.util.Scanner;

public class Exc11_2 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print(" Count to: ");
        int count = keyboard.nextInt();

        for (int n = 0; n != count+1; n++)
            System.out.print(n + " ");
    }
}

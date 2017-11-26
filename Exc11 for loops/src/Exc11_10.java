import java.util.Scanner;

public class Exc11_10 {

    public static void main(String[]args){

        Scanner kb = new Scanner(System.in);

        System.out.print("Your number: ");
        int n = kb.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
            sum = sum+i;
        }
        System.out.println();
        System.out.println("The sum is " + sum + ".");
    }
}

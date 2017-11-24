import java.util.Scanner;

public class Exc10_2 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        int steps = 0;
        int largest = 0;

        System.out.print("Starting number: ");
        int n = keyboard.nextInt();

        while ( n != 1){
            if ( n % 2 == 0)
                n = n / 2;
            else
                n = n*3+1;
            System.out.println(n);

            if (n > largest)
                largest = n;

            steps++;
        }
        System.out.println("It took " +steps +" steps and the largest value was " + largest +".");
    }
}

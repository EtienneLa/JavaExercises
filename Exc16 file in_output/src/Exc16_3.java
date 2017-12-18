import java.util.Scanner;
import java.io.PrintWriter;

public class Exc16_3 {

    public static void main( String [] args ) throws Exception {

        Scanner kb = new Scanner(System.in);

        System.out.println("You got a high score!");
        System.out.print("\nPlease enter your score: ");
        int score = kb.nextInt();
        System.out.print("Please enter your name: ");
        String name = kb.next();
        System.out.println("Data stored into score.txt.");

        PrintWriter out = new PrintWriter("score.txt");

        out.println("Your name: " + name);
        out.println("Your score: " + score);

        out.close();


    }
}

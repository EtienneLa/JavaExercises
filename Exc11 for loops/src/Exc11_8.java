import java.util.Scanner;

public class Exc11_8 {

    public static void main(String []args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();
        System.out.println();
        System.out.println("Your message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println();
        System.out.println("Here are all the characters, one at a time:\n");

        for (int i=0; i<message.length(); i++)
            System.out.println(i + ". '" + message.charAt(i) + "'");

    }
}

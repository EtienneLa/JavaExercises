import java.util.Scanner;

public class Exc3_4 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        String name1;
        String name2;
        int age;
        String birthday;
        double nc;

        System.out.println("Please enter the following information!");

        System.out.print("First name: "); name1 = keyboard.next();
        System.out.print("Last name: "); name2 = keyboard.next();
        System.out.print("Age: "); age = keyboard.nextInt();
        System.out.print("Birthday: "); birthday = keyboard.next();
        System.out.print("Your NC: "); nc = keyboard.nextDouble();

        System.out.println("First name: " + name1);
        System.out.println("Last name: " + name2);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("NC: " + nc);
    }
}

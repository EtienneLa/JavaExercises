import java.util.Scanner;

public class Exc3_3 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double money;

        System.out.print( "Hey there! What's your name? ");
        name = keyboard.next();

        System.out.print( "Hey " + name + " :) How old are you? ");
        age = keyboard.nextInt();

        System.out.print( "Oh.." + age + " is really old. How much do you make an hour? ");
        money = keyboard.nextDouble();

        System.out.print( "I hope " + money + " is enough to make a living.");
    }
}

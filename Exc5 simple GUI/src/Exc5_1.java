import javax.swing.*;

public class Exc5_1 {

    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        System.out.println("Hello, " + name + ".");
        System.out.println("You are " + age);

        System.exit(0);

    }


}

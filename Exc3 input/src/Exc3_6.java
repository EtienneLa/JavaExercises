import java.util.Scanner;

public class Exc3_6 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        float height;
        float weight;

        System.out.println("BMI CALCULATOR!");
        System.out.println(" ");
        System.out.print("Your height in m: ");
        height = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        weight = keyboard.nextFloat();
        System.out.println(" ");
        System.out.print("Your BMI is " + (weight / (height*height)));

    }
}

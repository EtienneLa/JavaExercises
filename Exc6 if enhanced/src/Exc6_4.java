import java.util.Scanner;

public class Exc6_4 {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        float height;
        float weight;
        float bmi;

        System.out.print("Your height in m: ");
        height = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        weight = keyboard.nextFloat();
        bmi = (weight / (height*height));
        System.out.println("\nYour BMI is " + bmi + ".");

        if ( bmi < 18.5){
            System.out.println("BMI Category: underweight");
        }
        if (bmi <= 24.9 && bmi >= 18.5){
            System.out.println("BMI Category: normal weight");
        }
        if (bmi <= 29.9 && bmi >= 25.0){
            System.out.println("BMI Category: overweight");
        }
        if (bmi > 30.0){
            System.out.println("BMI Category: obese");
        }
    }
}

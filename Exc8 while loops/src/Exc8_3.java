import java.util.Random;

public class Exc8_3 {

    public static void main(String[]args){

        Random r = new Random();
        int d1 = 1+r.nextInt(6);
        int d2 = 1+r.nextInt(6);

        System.out.println("HERE COMES THE DICE DOUBLE");

        System.out.println("\nRoll #1: " + d1);
        System.out.println("Roll #2: " + d2);
        System.out.println("The total is " +(d1+d2));

        while (d1 != d2){
            d1 = 1+r.nextInt(6);
            d2 =  1+r.nextInt(6);
            System.out.println("\nRoll #1: " + d1);
            System.out.println("Roll #2: " + d2);
            System.out.println("The total is " +(d1+d2));
        }
    }
}

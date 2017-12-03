import java.util.Random;

public class Exc7_5 {

    public static void main(String[]args){

        Random r = new Random();
        int d1 = 1 + r.nextInt(6);
        int d2 = 1 + r.nextInt(6);

        System.out.println("DICES");
        System.out.println("Roll #1: " + d1);
        System.out.println("Roll #2: " + d2);
        System.out.print("The total is " + ( d1 + d2));
    }
}

import java.util.Random;

public class Exc7_4 {

    public static void main(String[]args){

        Random r = new Random();
        int r2 = 1+r.nextInt(6);
        int r3 = 1+r.nextInt(54);
        int r4 = 1+r.nextInt(54);
        int r5 = 1+r.nextInt(54);
        int r6 = 1+r.nextInt(54);
        int r7 = 1+r.nextInt(54);
        int r8 = 1+r.nextInt(54);
        String fortune = "";

        if ( r2 == 1)
            fortune = "Change can hurt, but it leads a path to something better.";
        else if ( r2 == 2)
            fortune = "A smile is your passport into the hearts of others.";
        else if ( r2 == 3)
            fortune = "Hard work pays off in the future, laziness pays off now.";
        else if ( r2 == 4)
            fortune = "You cannot love life until you live the life you love.";
        else if ( r2 == 5)
            fortune = "You learn from your mistakes... You will learn a lot today.";
        else if ( r2 == 6)
            fortune = "A good way to keep healthy is to eat more Chinese food.";

        System.out.println(fortune);
        System.out.println("\nSome lotto number: " + r3 + "\t" + r4 + "\t" + r5 + "\t" + r6 + "\t" + r7 + "\t" + r8);
    }
}

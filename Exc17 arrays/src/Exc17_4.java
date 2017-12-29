import java.util.Random;

public class Exc17_4 {

    public static void main(String[] args) {

        int array[] = new int[1000];
        Random rng = new Random();

        for(int i = 0; i < array.length; i++){

            int r = 10 + rng.nextInt(89);
            array[i] = r;

            System.out.print(array[i] + "  ");
        }
    }
}

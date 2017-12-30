import java.util.Random;

public class Exc17_11 {

    public static void main(String[] args) {

        Random rng = new Random();
        int[] array = new int[10];
        int high = 0;

        System.out.print("Array:");
        for (int i = 0; i < array.length; i++) {

            int r = 1 +  rng.nextInt(100);
            array[i] = r;
            System.out.print(" " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] > high)
                high = array[i];
        }
        System.out.println("\nThe largest value is " + high);
    }
}

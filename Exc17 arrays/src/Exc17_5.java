import java.util.Random;

public class Exc17_5 {

    public static void main(String[] args) {

        Random rng = new Random();

        int[] array1 = new int[10];
        int[] array2;

        for (int i = 0; i < array1.length; i++) {

            int r = 1 + rng.nextInt(100);
            array1[i] = r;
        }
        array2 = array1.clone();
        array1[9] = -7;

        System.out.print("Array 1:");

        for (int i = 0; i < array1.length; i++) {

            System.out.print(" " + array1[i]);
        }
        System.out.print("\nArray 2:");
        for (int i = 0; i < array2.length; i++) {

            System.out.print(" " + array2[i]);
        }

    }
}

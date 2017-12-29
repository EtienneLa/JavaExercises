import java.util.Random;

public class Exc17_3 {

    public static void main(String[] args) {

        Random rng = new Random();
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++){

            int r = 1 + rng.nextInt(100);
            array[i] = r;

            System.out.println("Slot " + i + " contains a " + array[i]);
        }
    }
}

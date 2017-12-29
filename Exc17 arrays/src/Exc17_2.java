public class Exc17_2 {

    public static void main(String[] args) {

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++){

            array[i] = -130;

            System.out.println("Slot " + i + " contains a " + array[i]);
        }
    }
}

import java.util.*;

public class Exc23_ConvertingListsToArrays {

    public static void main(String[] args) {

        String[] array = {"dies", "das", "Ananas"};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.println();

        // array to list
        LinkedList<String> list = new LinkedList<>(Arrays.asList(array));

        // do some stuff with the list
        list.add("mehr");
        list.addFirst("erster");

        //back to an array
        array = list.toArray(new String[list.size()]);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }
}

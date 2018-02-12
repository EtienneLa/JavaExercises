import java.util.*;

public class Exc23_ConvertingListsToArrays {

    public static void main(String[] args) {

        String[] array = {"dies", "das", "Ananas"};

        for (String x : array) {
            System.out.printf("%s ", x);
        }
        System.out.println();

        // array to list
        LinkedList<String> list = new LinkedList<>(Arrays.asList(array));

        // do some stuff with the list
        list.add("mehr");
        list.addFirst("erster");

        //back to an array
        array = list.toArray(new String[list.size()]);

        for (String x : array) {
            System.out.printf("%s ", x);
        }
        System.out.println();
    }
}

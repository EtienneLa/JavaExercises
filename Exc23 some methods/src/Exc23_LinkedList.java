import java.util.*;

public class Exc23_LinkedList {

    public static void main(String[] args) {

        String[] things = {"apples", "banana", "bacon", "goATS", "noobs"};
        List<String> list1 = new LinkedList<>();
        for (String x : things)
            list1.add(x);

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<>();
        for (String x : things2)
            list2.add(x);

        list1.addAll(list2);
        list2 = null;

        printList(list1);
        removeItems(list1, 2, 5);
        printList(list1);
        reverseList(list1);
    }

    public static void printList(List<String> l) {

        for (String x : l)
            System.out.printf("%s ", x);
        System.out.println();
    }

    public static void removeItems(List<String> l, int from, int to) {

        l.subList(from, to).clear();
    }

    public static void reverseList(List<String> l) {

        ListIterator<String> it = l.listIterator(l.size());
        while (it.hasPrevious())
            System.out.printf("%s ", it.previous());
    }
}

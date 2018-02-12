import java.util.*;

public class Exc23_collections {

    public static void main(String[] args) {

        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //adding items to list
        for (String x : things)
            list1.add(x);

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        for (String x : moreThings)
            list2.add(x);

        for (int i = 0; i < list1.size(); i++)
            System.out.printf("%s ", list1.get(i));

        editList(list1, list2);
        System.out.println();

        for (int i = 0; i < list1.size(); i++)
            System.out.printf("%s ", list1.get(i));
    }

    public static void editList(Collection<String> l1, Collection<String> l2) {

        Iterator<String> it = l1.iterator();

        while (it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}

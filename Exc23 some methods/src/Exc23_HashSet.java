import java.util.*;

public class Exc23_HashSet {

    public static void main(String[] args) {

        String[] str = {"apple", "banana", "apple", "bacon", "bacon", "strawberry", "lasagna"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);

        //HashSet takes just the unique items out of a list and does not transfers duplicates
        Set<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }
}

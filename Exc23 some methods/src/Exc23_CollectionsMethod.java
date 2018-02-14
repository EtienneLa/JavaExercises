import java.util.*;

public class Exc23_CollectionsMethod {

    public static void main(String[] args) {

        String[] words = {"apples", "lemons", "bacon", "bananas", "stuff"};
        List<String> list = Arrays.asList(words);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("%s", list);
    }
}

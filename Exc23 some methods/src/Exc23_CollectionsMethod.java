import java.util.*;

public class Exc23_CollectionsMethod {

    public static void main(String[] args) {

        //Collection sorting
        String[] words = {"apples", "lemons", "bacon", "bananas", "stuff"};
        List<String> list = Arrays.asList(words);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("%s", list);
        System.out.println();


        //reverse / copy methods
        Character[] cray = {'a', 'n', 't', 'b'};
        List<Character> clist = Arrays.asList(cray);
        System.out.println("List is:");
        output(clist);

        Collections.reverse(clist);
        System.out.println("After reverse:");
        output(clist);

        Character[] cray2 = new Character[4];
        List<Character> clist2 = Arrays.asList(cray2);

        Collections.copy(clist2, clist);
        System.out.println("Copied list:");
        output(clist2);


        //fill method
        Collections.fill(clist, 'a');
        System.out.println("After filling:");
        output(clist);
        System.out.println("-------------------");


        //addAll method
        String[] food = {"apples", "beef", "ham", "burgers"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(food));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("youtube");
        list2.add("google");
        list2.add("twitter");

        for(String x : list2)
            System.out.printf("%s ", x);
        System.out.println();

        Collections.addAll(list2, food);

        for(String x : list2)
            System.out.printf("%s ", x);
        System.out.println();

    }

    private static void output(List<Character> list) {

        for (char x : list)
            System.out.printf("%s ", x);
        System.out.println();
    }
}

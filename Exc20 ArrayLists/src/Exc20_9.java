import java.util.*;

public class Exc20_9 {

    public static void main( String[] args ) {

        System.out.print("Sentence: ");
        Scanner kb = new Scanner(System.in);
        String sentence = kb.nextLine();

        ArrayList<String> splitsentence = new ArrayList<>();

        for ( String word : sentence.split(" "))
            splitsentence.add(word);

        Collections.sort(splitsentence);

        System.out.println(splitsentence);
    }
}

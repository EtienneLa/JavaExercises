public class StringMethod_1 {

    public static void  main(String[] args) {

        String[] words = {"funk", "chunk", "furry"};

        for (String w : words) {
            //startWith
            if(w.startsWith("fu"))
                System.out.println(w);
            //endsWith
            if(w.endsWith("unk"))
                System.out.println(w);

        }
    }
}

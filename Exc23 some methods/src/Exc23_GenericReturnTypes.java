public class Exc23_GenericReturnTypes {

    public static void main(String[] args) {

        System.out.println(max(24, 42, 5));
        System.out.println(max("apple", "pizza", "mushroom"));
        System.out.println(max('s', 'h', 'a'));
    }
    //this method can handle all of the comparable datatypes and returns any possible type it handles
    private static <T extends Comparable<T>> T max(T a, T b, T c) {

        T m = a;

        if(b.compareTo(a) > 0)
            m = b;
        if(c.compareTo(m) > 0)
            m = c;

        return m;
    }
}

public class Exc23_GenericMethod {

    public static void main(String[] args) {

        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'a', 'b', 'c', 'd'};
        String[] sray = {"apple", "stuff", "banana", "more Stuff"};
        Double[] dray = {1.2345, 2.3456, 3.4567};

        printArray(iray);
        printArray(cray);
        printArray(sray);
        printArray(dray);
    }
    //<T> stands for generic datatype and can handle all types of data
    private static <T> void printArray(T[] x) {
        for(T t : x)
            System.out.printf("%s ", t);
        System.out.println();
    }
}

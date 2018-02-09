public class StringMethod_2 {

    public static void main(String[] args) {

        //indexOf - first char at which position

        String s = "etiennelaetiennela";

        System.out.println(s.indexOf('t'));
        System.out.println(s.indexOf('t', 3)); //ignore first 3 index
        System.out.println(s.indexOf('x')); //prints out false or -1
        System.out.println(s.indexOf("ne"));

        //concat Method, links Strings
        String a = "foot";
        String b = "ball";

        System.out.println(a.concat(b));
        String c = a.concat(b);
        System.out.println(c);
    }
}

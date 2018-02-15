import java.util.*;

public class Exc23_stack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        //puts every new item "on top"
        stack.push("bottom");
        stack.push("second");
        stack.push("third");

        System.out.printf("%s ", stack);
        System.out.println();
        //takes the item "on top" of the stack
        stack.pop();

        System.out.printf("%s ", stack);
        System.out.println();

        stack.pop();

        System.out.printf("%s ", stack);
        System.out.println();

        stack.pop();

        System.out.printf("%s ", stack);
        System.out.println();

    }
}

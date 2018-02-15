import java.util.*;

public class Exc23_queue {

    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>();

        //first item offered has the highest priority inside the list
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.println(q);
        //peek() calls the item with the highest priority
        System.out.println(q.peek());

        //after being done with the peek() item you can remove it with poll()
        q.poll();
        System.out.println(q);
    }
}

// priority queue
import java.util.*;

class CollectionClass6{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("red");
        pq.add("black");
        pq.add("blue");
        pq.add("white");
        pq.add("green");
        pq.offer("grey");

        System.out.println("queue after adding all elements :- "+pq);

        System.out.println("head element using element method :- "+pq.element());

        System.out.println("head element using peek method :- "+pq.peek());

        pq.remove();

        System.out.println("queue after removing element using remove method :- "+pq);

        pq.poll();

        System.out.println("queue after removing element using peek method :- "+pq);
        
    }
}
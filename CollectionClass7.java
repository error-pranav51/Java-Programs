// Deque

import java.util.*;

class CollectionClass7{
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("red");
        dq.add("black");
        dq.add("green");
        dq.add("white");

        System.out.println(" deque before adding using offerFirst :- "+dq);
        dq.offerFirst("grey");
        System.out.println("deque before adding using offerLast :- "+dq);
        dq.offerLast("blue");
        System.out.println("after adding all elemets :- "+dq);
        dq.remove();
        System.out.println("after removing using remove method :- "+dq);
        dq.pollLast();
        System.out.println("after removing using pollLast method :- "+dq);
        dq.pollFirst();
        System.out.println("after removing using remove method :- "+dq);
        System.out.println("head element :- "+dq.element());
        System.out.println("peek element :- "+dq.peek()); 
    }
}
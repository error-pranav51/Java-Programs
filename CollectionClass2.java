import java.util.*;

class CollectionClass2{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("red");
        ll.push("black");
        ll.addFirst("blue");
        ll.addLast("white");

        System.out.println("traversing list :- ");

        Iterator<String> itr = ll.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("first element of list :- "+ll.getFirst());

        System.out.println("last element of list :- "+ll.getLast());

        System.out.println("is there any black color in list :- "+ll.contains("black"));

        System.out.println("index of black color :- "+ll.indexOf("black"));

        ll.set(ll.indexOf("black"),"grey");

        System.out.println("after changing black with grey :- "+ll);

        
        ll.removeFirst();
        System.out.println("after removing first element :- "+ll);

        ll.removeLast();
        System.out.println("after removing last element :- "+ll);

        ll.clear();
        System.out.println("after clearing the list :- "+ll);

    }
}
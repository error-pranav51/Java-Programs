

// HashSet example

import java.util.*;

class CollectionClass3{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("red");
        set.add("blue");
        set.add("green");
        set.add("black");
        set.add("white");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("trying to add black once again in set :- ");
        set.add("black");
        System.out.println("set after adding black twice :- "+set);

        System.out.println("before removing white from set :- "+set);
        set.remove("white");

        System.out.println("after removing white from set :- "+set);

        System.out.println("size of set :- "+set.size());

        System.out.println("checking wether set contains red or not :- "+set.contains("red"));

        System.out.println("checking wether set is empty or not :- "+set.isEmpty());



    }
}
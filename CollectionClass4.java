// LinkedHashSet

import java.util.*;

class CollectionClass4{
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println("set after adding strings :- "+set);

        set.add("five");
        System.out.println("set after adding five twice :- "+set);

        System.out.println("before removing four :- "+set);

        set.remove("four");
        System.out.println("after removing four :- "+set);

        System.out.println("checking wether set is empty or not :- "+set.isEmpty());

        System.out.println("size of set :- "+set.size());
        System.out.println("checking weather set contains two or not :- "+set.contains("two"));
        set.clear();
        System.out.println("after clearing set :- "+set);

    }
}
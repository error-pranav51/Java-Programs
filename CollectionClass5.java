// Treeset
import java.util.*;

class CollectionClass5{
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();

        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(2);
        tree.add(3);

        System.out.println("tree after adding elements :- "+tree);

        System.out.println("head set of tree :- "+tree.headSet(3));

        System.out.println("subset of tree :- "+tree.subSet(2,4));

        System.out.println("tailset of tree :- "+tree.tailSet(3));


    }
}
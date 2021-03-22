import java.util.*;

class CollectionClass1{
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        list.add("red");
        list.add("black");
        list.add("white");
        list.add("grey");
        list.add("blue");

        System.out.println("list :- "+list);

        System.out.println("traversing list using iterator :- ");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("traversing list using for loop :- ");
        for(String color : list){
            System.out.println(color);
        }


        System.out.println("returning element at index 2 :-"+list.get(2));

        System.out.println("changing value of element at index 2 :-"+list.set(2,"voilet"));

        System.out.println("returning size of array list :- "+list.size());

        Collections.sort(list);
        System.out.println("list after sorting elements :- "+list);

        System.out.println("checking whether list contains blue color or not :- " +list.contains("blue"));

        System.out.println("checking whether the arraylist is empty :- "+list.isEmpty());
    }
}
// hash map 2
import java.util.*;

class CollectionClass9{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        
        map.put(1,"red");
        map.put(4,"black");
        map.put(5,"blue");
        map.put(2,"green");
        map.put(3,"white");

        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("size of map :- "+map.size());

        map.remove(4);
        System.out.println("set after removing entry with key = 4 :- "+map);
        
        map.replace(5,"voilet");
        System.out.println("map after updating value of key 5 from blue to voilet :- "+map);

        map.clear();
        System.out.println("map after clear function :- "+map);
    }
}
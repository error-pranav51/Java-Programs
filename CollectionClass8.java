// hash map 1
import java.util.*;

class CollectionClass8{
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
    }
}
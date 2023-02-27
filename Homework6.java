import java.util.HashMap;
import java.util.Iterator;


public class Homework6 {
    // Develop a program that mimics the behavior of a HashSet collection.
    // In the program, create an add method that adds an element, the toString method
    // returning a string with set elements and a method that allows
    // read elements by index. The data format is Integer.

    public static void main(String[] args) {
        
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        myHashSet.add(6);
        myHashSet.add(37);
        myHashSet.add(6);

        System.out.println(myHashSet);  // 1 37 6 

        for (int i = 0; i < myHashSet.size(); i++) {
            System.out.println(myHashSet.readElementsByIndex(i));
            
        }


    }

}

class MyHashSet {
    private HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object();

    public boolean add(Integer i) {
        return map.put(i, OBJ) != null ? true : false;
    }

    @Override
    public String toString() {
        String resultStr = "";
        // map.keySet() returns a Set view of the keys contained in this map.
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            resultStr += iterator.next().toString() + " ";
        }
        return resultStr;
    }
    
    public Object readElementsByIndex(Integer i) {
        return map.keySet().toArray()[i];
    }

    public Integer size() {
        return map.keySet().size();
    }
}

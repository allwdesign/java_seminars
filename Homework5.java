import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework5 {
    public static void main(String[] args) {
        // Create a HashMap dictionary. Generic <Integer, String>.
        Map<Integer, String> colors = new HashMap<>();
        
        // Fill with three keys (index, color), add a key if there was none!)
        colors.put(1, "Красный");
        colors.put(2, "Оранжевый");
        colors.put(3, "Жёлтый");
        colors.putIfAbsent(4, "Зелёный");
        
        // Change the values by adding exclamation marks.
        
        // 1st variant
        // for (var item: colors.entrySet()) {
        //     item.setValue(item.getValue() + "!");
        //     System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        // }

        //2nd variant
        for (int i = 0; i < colors.size(); i++) {
            //colors.put(i, colors.get(i) + "!");
            colors.compute(i, (k, v) -> v + "!");
        }
        System.out.println(colors);
        
        // *Create a TreeMap, fill in the same way.
        TreeMap<Integer,String> colorsTMap = new TreeMap<>();
        colorsTMap.put(1, "Красный");
        colorsTMap.put(2, "Оранжевый");
        colorsTMap.put(3, "Жёлтый");
        colorsTMap.put(4, "Зелёный");
        System.out.println(colorsTMap);
    
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapsDemo {

    public static void main(String[] args) {

        // 基于 Hash Map 实现的键值对存储结构
        Map<String, Integer> hasMap = new HashMap<>();

        hasMap.put("One", 1);
        hasMap.put("Two", 2);



        System.out.println("\n This is a placeholder for the Map class." + hasMap);

        // 基于 Tree Map 实现的有序键值对存储结构

        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("C", "Cat");
        treeMap.put("A", "Apple");
        treeMap.put("B", "Banana");


        String a =  treeMap.get("A");
        String bc =  treeMap.get("B");
        String c =  treeMap.get("C");

        System.out.println("TreeMap contents (sorted by keys): " + treeMap + ", get A: " + a + ", get B: " + bc + ", get C: " + c);
    }
    
}

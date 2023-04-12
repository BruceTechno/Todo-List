import java.util.Map;
import java.util.TreeMap;

public class treemap_test {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap1 = new TreeMap<>();
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>();
        treeMap1.put(1,0);
        treeMap1.put(2,1);
        treeMap1.put(3,2);
        System.out.println(treeMap1);
        treeMap2.put(1,3);
        treeMap2.put(2,4);
        treeMap2.put(3,5);
        System.out.println(treeMap2);
        treeMap1.putAll(treeMap2);
        System.out.println(treeMap1);
    }
}
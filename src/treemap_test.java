import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treemap_test {
    public static void main(String[] args) {
        int topic = 1;
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Map<String, String>> treeMap = new TreeMap<>();
        Map<String, String> desMap = new HashMap<>();

        System.out.println("Enter a description for the new item");
        String description = scanner.nextLine();

        System.out.println("Enter a priority for the new item (1~5)");
        String strPriority = scanner.nextLine();
        int priority = Integer.parseInt(strPriority);

        System.out.println("Enter a deadline for the new item(yyyy-mm-dd)");
        String deadline = scanner.nextLine();
        //Map put
        desMap.put(description, deadline);
        treeMap.put(priority, desMap);
        System.out.println("Item added");

//        for (Map.Entry<String, String> item : desMap.entrySet()) {
//            System.out.println(item.getKey());//des
//            System.out.println(item.getValue());//pri
            for (Map.Entry<Integer, Map<String, String>> x : treeMap.entrySet()) {
                int key = x.getKey();
                for(Map.Entry<String ,String >item :x.getValue().entrySet()){
//                    System.out.printf("%d.%s (priority %d , due by %s ) \n", topic, /*des*/, /*pri*/, /*deadline*/);
                    System.out.println(item.getKey());

                }

            }
        }
//        topic++;
    }


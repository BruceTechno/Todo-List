import java.util.*;

public class tes2 {
    public static void main(String[] args) {
        int times = 0;

        TreeMap<Integer, Map<String, String>> treeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            times++;
            System.out.println("Welcome to your Todo List. Enter an option ");

//            System.out.println("Enter an option");
            System.out.println("1.Add an item");
            System.out.println("2.Remove an item");
            System.out.println("3.Print the list ");
            System.out.println("4.Quit");

            //待辦事項 存進去String 陣列中 priority 可以用 set 調換位子
            //getOption(scannerOption);
            int option = getOption();//option防呆

            if (option == 4) {
                System.out.println("Goodbye");
                break;
            }

            switch (option) {
                case 1://Add an item
                    System.out.println("Enter a description for the new item");
                    String description = scanner.nextLine();

                    System.out.println("Enter a priority for the new item (1~5)");
                    String strPriority = scanner.nextLine();
                    int priority = Integer.parseInt(strPriority);

                    System.out.println("Enter a deadline for the new item(yyyy-mm-dd)");
                    String deadline = scanner.nextLine();
                    //Map 要設在迴圈裏面 在treemap中的Map是很多個不一樣的 而第一圈的TreeMap只有一個
                    Map<String, String> desMap = new HashMap<>();
                    desMap.put(description, deadline);
                    treeMap.put(priority, desMap);
                    System.out.println("Item added");
                    System.out.println();
                    break;
                case 2://Remove an item
//                    TreeMap<Integer, Map<String, String>> tempTree = new TreeMap<>();
                    System.out.println(treeMap);///for test

                    TreeMap<Integer, Map<String, String>> newTree = new TreeMap<>();
                    System.out.println("Enter the number of the item you wanna  remove");
                    String remNum = scanner.nextLine();//3
                    int removeNum = Integer.parseInt(remNum);
                    for (Map.Entry<Integer, Map<String, String>> item : treeMap.entrySet()) {
                        if (item.getKey() == removeNum) {
                            continue;
                        } else if (item.getKey() > removeNum) {
                            newTree.put(item.getKey() - 1, item.getValue());
                        } else {
                            newTree.put(item.getKey(), item.getValue());
                        }
                    }
                    for (Map.Entry<Integer, Map<String, String>> x : newTree.entrySet()) {
                        for (Map.Entry<String, String> item : x.getValue().entrySet()) {
                            System.out.printf("priority %d : %s , (due by %s) \n", x.getKey(), item.getKey(), item.getValue());
                        }
                    }
                        treeMap.putAll(newTree);
                    System.out.println(treeMap);//for test
                    System.out.println("Remove successfully");
                    break;

                case 3://Print the list
                    System.out.println();
                    System.out.println("Your Todo List is");

                    for (Map.Entry<Integer, Map<String, String>> x : treeMap.entrySet()) {
                        for (Map.Entry<String, String> item : x.getValue().entrySet()) {
                            System.out.printf("priority %d : %s , (due by %s) \n", x.getKey(), item.getKey(), item.getValue());
                        }
                    }
                    System.out.printf("\n");
                    break;
            }
        }
    }

    //option防呆
    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option > 4 || option <= 0) {
                System.out.println("請輸入1~4");
            } else {
                return option;
            }
        }
    }
}

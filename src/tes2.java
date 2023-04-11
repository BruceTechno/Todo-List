//import java.util.*;
//
//public class tes2 {
//    public static void main(String[] args) {
//        int topic=0;
//        TreeMap<Integer,Map<String ,String >> treeMap = new TreeMap<>();
//        Map<String,String > desMap= new HashMap<>();
//        List<Integer> priorityList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        for (; ; ) {
//
//            System.out.println("Welcome to your Todo List. Enter an option ");
//
////            System.out.println("Enter an option");
//            System.out.println("1.Add an item");
//            System.out.println("2.Remove an item");
//            System.out.println("3.Print the list ");
//            System.out.println("4.Quit");
//
//            //待辦事項 存進去String 陣列中 priority 可以用 set 調換位子
//            //getOption(scannerOption);
//            int option = getOption();//option防呆
//
//            if (option==4){
//                System.out.println("Goodbye");
//                break;
//            }
//
//            switch (option) {
//                case 1://Add an item
//                    System.out.println("Enter a description for the new item");
//                    String description = scanner.nextLine();
//
//                    System.out.println("Enter a priority for the new item (1~5)");
//                    String strPriority = scanner.nextLine();
//                    int priority = Integer.parseInt(strPriority);
//
//                    System.out.println("Enter a deadline for the new item(yyyy-mm-dd)");
//                    String deadline = scanner.nextLine();
//                    //Map put
//                    desMap.put(description, deadline);
//                    treeMap.put(priority, desMap);
//                    System.out.println("Item added");
//                    System.out.println();
//                    break;
//                case 2://Remove an item
//                    System.out.println("Enter the number of the item you wanna  remove");
//
//
//                    System.out.println("Remove successfully");
//                    break;
//                case 3://Print the list
//                    System.out.println();
//                    System.out.println("Your Todo List is");
//
//                    ////////treemap key, treemap value
//                    //treemap<priority,(Map<description,deadline>)>
//                    // print description + priority + deadline
//
//                    for (Map.Entry<Integer, Map<String, String>> item : treeMap.entrySet()) {
//                        System.out.printf("%d.%s (priority %d , due by %s ) \n", topic,/*des*/,item.getKey()/*priority*/,/*deadline*/);
//                    }
//
//                    topic++;
//                        System.out.printf("\n");
//                        break;
//                    }
//
//        }
//    }
//    //option防呆
//    public static int getOption(){
//        Scanner scanner = new Scanner(System.in);
//        for (;;) {
//            int option= scanner.nextInt();
//            scanner.nextLine();
//            if (option > 4 || option <= 0) {
//                System.out.println("請輸入1~4");
//            } else {
//                return option;
//            }
//        }
//    }
//}

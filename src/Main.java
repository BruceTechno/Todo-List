import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//1.description 要可以讓人 打空白建 例如:do homework
//2.兩個優先都輸入1會怎樣 //ok
//2.刪除1的時候 2的優先會變成1 0408未完 0409 ook
//2.輸入限定在1~5
// 限定日期格式 yyyy-mm--dd  還有 日期大小 1~12--1~31
//0408 修道 2.remove case2 59行開始 要+迴圈 讓刪除第一個之後 第2.3個可以遞補順序往上。ok

public class Main {
    public static void main(String[] args) {
        List<String> descriptionList = new ArrayList<>();
        List<Integer> priorityList = new ArrayList<>();
        List<String> deadlineList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {

            System.out.println("Welcome to your Todo List. Enter an option ");

//            System.out.println("Enter an option");
            System.out.println("1.Add an item");
            System.out.println("2.Remove an item");
            System.out.println("3.Print the list ");
            System.out.println("4.Quit");

            //待辦事項 存進去String 陣列中 priority 可以用 set 調換位子

            //getOption(scannerOption);
            int option = getOption();//option防呆

            if (option==4){
                System.out.println("Goodbye");
                break;
            }

            switch (option) {
                case 1://Add an item
                    System.out.println("Enter a description for the new item");
                    scanner.nextLine();
                    String description = scanner.nextLine();
                    descriptionList.add(description);
                    System.out.println("Enter a priority for the new item (1~5)");
                    int priority = scanner.nextInt();

                    if (priorityList.contains(priority)) {
                        System.out.println("priority iterate.put priority to the next one");
                        priority=(priorityList.size()+ 1);
                    }

                    priorityList.add(priority);
//                        priority=0;
                    System.out.println("Enter a deadline for the new item(yyyy-mm-dd)");
                    String deadLine = scanner.next();
                    deadlineList.add(deadLine);
                    System.out.println("Item added");
                    System.out.println();
                    break;
                case 2://Remove an item
                    System.out.println("Enter the number of the item you wanna  remove");
                    //用 Map get key&Value 去remove
                    int removeNum = scanner.nextInt();

                    descriptionList.remove(removeNum - 1);
                    priorityList.remove(removeNum - 1);//
                    deadlineList.remove(removeNum - 1);//
                    //if removeNum =1 priorityList 全部-1
                    //if removeNum >priorityList.get(removeNum)
                    if (removeNum==1){
                        for (int i=0 ; i <priorityList.size(); i++){
                            priorityList.set(i,i+1);
                        }
                    }
                    if (removeNum>1){
                        for (int i = 1 ; i<priorityList.size() ;i++){
                            priorityList.set(i,i+1);
                        }
                    }
//                    priorityList.set(priorityList.size() - 1, (priorityList.get(removeNum - 1)) - 1);

                    System.out.println("Remove successfully");
                    break;
                case 3://Print the list
                    System.out.println();
                    System.out.println("Your Todo List is");

                    // print descriptionList + priorityList + deadlineList
                    for (int i = 0; i < deadlineList.size(); i++) {
                        System.out.printf("%d.%s (priority %d , due by %s ) \n", i + 1, descriptionList.get(i), priorityList.get(i), deadlineList.get(i));
                    }
                    System.out.printf("\n");
                    break;
            }
        }
    }
    //option防呆
    public static int getOption(){
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int option= scanner.nextInt();
            scanner.nextLine();
            if (option > 4 || option <= 0) {
                System.out.println("請輸入1~4");
            } else {
                return option;
            }
        }
    }
}
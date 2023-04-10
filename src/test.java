import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//1.description 要可以讓人 打空白建 例如:do homework
//2.兩個優先都輸入1會怎樣 //ok
//2.刪除1的時候 2的優先會變成1 0408未完 0409 ook
//2.輸入限定在1~5
// 限定日期格式 yyyy-mm--dd  還有 日期大小 1~12--1~31
//0408 修道 2.remove case2 59行開始 要+迴圈 讓刪除第一個之後 第2.3個可以遞補順序往上。ok
//------------------------------------------
//陣列型態用Objecy
//case裡面改成呼叫方法
//全部scanner接收型態改成string 再轉int
//0409 priority 遞補順序2.remove
//((String)objRes)
//若有需要 字串陣列跟整數陣列 寫兩個陣列
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> list = new ArrayList<>();//一個String 一個Interger 給priority
        for (; ; ) {
            System.out.println("Welcome to your Todo List. Enter an option ");
            System.out.println("1.Add an item");
            System.out.println("2.Remove an item");
            System.out.println("3.Print the list ");
            System.out.println("4.Quit");

            //待辦事項 存進去String 陣列中 priority 可以用 set 調換位子

            int option = getOption();//option防呆

            if (option==4){
                System.out.println("Goodbye");
                break;
            }
//description:0、3   priority:1、4  deadLine:2、5
            switch (option) {
                case 1://Add an item
                    System.out.println("Enter a description for the new item");
                    String description = scanner.nextLine();
                    list.add(description);
                    System.out.println("Enter a priority for the new item (1~5)");
                    String priority = scanner.nextLine();
                    list.add(priority);
                    System.out.println("Enter a deadline for the new item(yyyy-mm-dd)");
                    String deadLine = scanner.nextLine();
                    list.add(deadLine);

                    System.out.println("Item added");
                    System.out.println();
                    break;
                case 2://Remove an item
                    System.out.println("Enter the number of the item you wanna  remove");
                    //用 Map get key&Value 去remove
                    String  removeNum = scanner.nextLine();
                    if (removeNum.equals("1")){
//                        list.remove(0);
//                        list.remove(1);
//                        list.remove(2);
                        for (int i=0; i< list.size()/3; i++){//若只有1 會出錯
                            list.set(i*3+1,i+1);
                        }
                    }
                    if (removeNum.equals("2")){
//                        list.remove(3);
//                        list.remove(4);
//                        list.remove(5);
                        for (int i=0 ; i< list.size()/3 ; i++){
                            list.set(i*3+1,i+1);
                        }
                    }
                    if (removeNum.equals("3")){
//                        list.remove(6);
//                        list.remove(7);
//                        list.remove(8);
                    }
                    if (removeNum.equals("4")){
//                        list.remove(9);
//                        list.remove(10);
//                        list.remove(11);
                    }
                    if (removeNum.equals("5")){
//                        list.remove(12);
//                        list.remove(13);
//                        list.remove(14);
                    }

                    System.out.println("Remove successfully");
                    break;
                case 3://Print the list
                    System.out.println();
                    System.out.println("Your Todo List is");
                    // print descriptionList + priorityList + deadlineList
                    for (int i=0 ; i<list.size(); i+=3){
                        System.out.printf("%d.%s (priority %s , due by %s ) \n",(i/3)+1,list.get(i),list.get(i+1),list.get(i+2));
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
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for (int i =1 ; i<10 ; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.subList(0,3));
        list.removeAll(list.subList(0,3));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
    }


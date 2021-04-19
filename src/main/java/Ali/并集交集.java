package Ali;

import java.util.ArrayList;
import java.util.List;

public class 并集交集 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(32);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        list2.add(4);
        list2.add(22);
        list2.add(3);
        list2.add(1);

        list1.retainAll(list2);
        System.out.println(list1);
    }

}

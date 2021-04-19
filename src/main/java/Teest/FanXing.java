package Teest;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class FanXing {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<String> list2 = new ArrayList<>();
        list2.add("dfsdf");

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass() == list2.getClass());

        List<Integer> list = new ArrayList<>();

        list.add(1);

        list.getClass().getMethod("add",Object.class).invoke(list,"ads");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println('a' - 'b');

    }
}

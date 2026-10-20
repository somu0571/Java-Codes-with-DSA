package ArrayLists;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(8);
        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder()); // decending order
        System.out.println(list);
    }
}

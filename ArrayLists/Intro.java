package ArrayLists;

import java.util.*;

public class Intro {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // create of arraylist
        list.add(1); // adding element in ArrayList
        list.add(45); // adding element in ArrayList
        System.out.println(list);
        int revive = list.get(0); // get the element , returns index
        System.out.println(revive);
        list.add(69);
        list.add(47);
        System.out.println(list);
        list.remove(0); // removing element from arraylist
        System.out.println(list);
        list.set(2, 1000); // setting element
        System.out.println(list);
        list.contains(0); // checking element
        System.out.println(list);
        System.out.println(list.size()); // size of arraylist
    }
}

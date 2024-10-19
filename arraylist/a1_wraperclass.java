package arraylist;

import java.util.ArrayList;

public class a1_wraperclass {
    public static void main(String[] args) {
        // wraper classes
        // Integer i=Integer.valueOf(4);
        // System.out.println(i);
        // Boolean b=Boolean.valueOf(true);
        // System.out.println(b);

        // creating arraylist

        ArrayList<Integer> l1 = new ArrayList<>();

        // add elemnts
        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7
        l1.add(8);
        l1.add(9);
        // get an elemnt at index
        System.out.println(l1.get(1));// 6

        // print with for loop
        for (int i = 0; i < l1.size(); i++) {

            System.out.println(l1.get(i));
        }

        // direct print

        System.out.println(l1);

        // adding element at somr index
        l1.add(1, 100);
        System.out.println(l1);
        // modifying element at index
        l1.set(1, 10);
        System.out.println(l1);

        // removing an elemnt at index

        l1.remove(1);
        System.out.println(l1);

        // remove an elemnt e

        l1.remove(Integer.valueOf(6));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(8)));
        System.out.println(l1.remove(Integer.valueOf(18)));// method return boolean

        // checking if an element exist

        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you dont specify class you can put anything inside l

        ArrayList l2 = new ArrayList<>();
        l2.add("asdf");
        l2.add(1);
        l2.add(true);

        System.out.println(l2);

    }

}

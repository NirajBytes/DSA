import java.util.ArrayList;
import java.util.Collections;
class a2_sort{
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(11);
        nums.add(1);
        nums.add(10);
        nums.add(9);
        nums.add(5);
        Collections.sort(nums);//coolection is a class and sort is one of the methhod in this class
        System.out.print(nums);
    }
}
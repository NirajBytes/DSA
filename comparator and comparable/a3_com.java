import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class a3_com{
    public static void main(String[] args) {
        Comparator<Integer>com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if (i%10>j%10) {
                    return 1;
                }
                else{
                    return -1;
                }
    
            }
    
        };
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(11);
        nums.add(19);
        nums.add(95);
        nums.add(43);
        nums.add(39);
        Collections.sort(nums,com);//collection is a class and sort is one of the method in this class
        System.out.print(nums);
    }
}
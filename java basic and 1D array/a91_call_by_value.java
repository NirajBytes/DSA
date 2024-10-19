
public class a91_call_by_value {
    static void changeValue(int a) {// this a is at different memory location
        a *= 10;
        System.out.println("inside the method change value\n" + a);
    }

    public static void main(String[] args) {
        int a = 10;// store a at some memory location
        System.out.println("before changing value\n" + a);
        changeValue(a);
        System.out.println("after changing value\n" + a);
    }
}

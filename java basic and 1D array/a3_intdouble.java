//**************how int and double works****************** //
public class a3_intdouble {
    public static void main(String[] args) {
        double ans = 7 / 22 * (44 + 11) * 44 / 5; // 7/22 gives 0 bcaz of int/int format
        double ans1 = 7 / 22 + (44 + 11) * 44 / 5; // gives some value
        System.out.println(ans);
        System.out.println(ans1);
    }
}

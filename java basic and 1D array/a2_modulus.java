//******************modulus concept***************//
public class a2_modulus {
    public static void main(String[] args) {
        int a = 3, b = 89;
        int r = a % b; // when a<b means divident is smaller than divisor it returns dividents as
                       // remainder
        int r1 = b % -a;// b%-a = b%a hence it returns actual remainder
        System.out.println(r1);
        System.out.println(r);
    }
}

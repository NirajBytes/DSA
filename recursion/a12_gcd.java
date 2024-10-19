public class a12_gcd {
    static int GCD(int x, int y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(GCD(24, 15));
    }
}

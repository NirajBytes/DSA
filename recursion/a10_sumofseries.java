public class a10_sumofseries {
    static int sum(int n) {
        if (n == 0)
            return 0;
        return sum(n - 1) + n;
    }

    static int sum1(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return sum1(n - 1) - n;
        } else {
            return sum1(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum1(5));
    }
}

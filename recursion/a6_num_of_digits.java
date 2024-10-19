public class a6_num_of_digits {
    static int s = 0;

    static int NOD(int n) {
        // base case
        if (n >= 0 && n <= 9) {
            return s += 1;
        }
        // recursive work
        NOD(n / 10);
        // self work
        s++;
        return s;

    }

    public static void main(String[] args) {
        int n = 1234;
        int result = NOD(n);
        System.out.println(result);
    }
}

//What is the output of below code?
class a92_mcq {
    public static void decrease(int n1, int n2) {
        n1--;
        n2 = n2 - 2;
        System.out.println(n1 + ":" + n2);
        // nl and n2 are formal parameters
    }

    public static void main(String[] args) {
        int p = 26;
        int q = 13;
        decrease(p, q);
        System.out.println(p + ":" + q);
        // p and q are actual parameters.
    }
}
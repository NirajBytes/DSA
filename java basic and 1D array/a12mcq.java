public class a12mcq {
    public static void main(String[] args) {
        // Question

        // Let say we have 4 variables of type int; p,q,r,s

        // s = p-++r+++q

        // s equivalent to ?
        int p = 4, q = 3, r = 2, s;
        s = p - ++r - ++q;// 4-3-4//=-3
        System.out.println(s);

    }
}

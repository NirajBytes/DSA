public class a9_relational_operator {
    // Java Relational Operators
    // == Is Equals to
    // != Not Equals to
    // > Greater Than
    // Java Logical Operators
    // && (LOGICAL AND)
    // || (LOGICAL OR)
    // ! (LOGICAL NOT)
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        // && operator
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false
        // ||operator

        System.out.println((r < q) || (p < q)); // true

        System.out.println((p > q) || (q > r)); // true

        System.out.println((p > q) || (q > r)); // true
        // ! operator

        System.out.println(!(p == 0)); // true

        System.out.println(!(p > 0)); // false
    }
}

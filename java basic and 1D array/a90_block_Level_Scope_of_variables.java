//lecture13
class algebra {
    void demo() {
        int a = 90;
        System.out.println(a);
        // System.out.println(b);✕
        {
            int b = 20;
            System.out.println(b);// ✓
        }
        // System.out.println(b);✕
    }

}

public class a90_block_Level_Scope_of_variables {
    public static void main(String[] args) {
        algebra s = new algebra();
        s.demo();
    }
}

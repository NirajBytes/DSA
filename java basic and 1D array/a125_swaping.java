public class a125_swaping {
    static void swapper(int x, int y) {
        System.out.println("values before swap ");
        System.out.println(" a " + x);
        System.out.println(" b " + y);
        x = x + y;// 40
        y = x - y;// 10
        x = x - y;// 30
        System.out.println("values after swap");
        System.out.println(" a " + x);
        System.out.println(" b " + y);

    }

    public static void main(String[] args) {
        int a = 10, b = 30;

        swapper(a, b);
    }

}

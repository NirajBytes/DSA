public class a124_swaping {
    static void swapper(int x, int y) {
        System.out.println("values before swap ");
        System.out.println(" a " + x);
        System.out.println(" b " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("values after swap");
        System.out.println(" a " + x);
        System.out.println(" b " + y);

    }

    public static void main(String[] args) {
        int a = 10, b = 30;

        swapper(a, b);
    }

}

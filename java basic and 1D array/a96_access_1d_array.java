public class a96_access_1d_array {
    void demoarray() {
        int[] ages = new int[5];// declared//gets memory at heap///at stack only reference vafible is store
        ages[0] = 65;// intialized
        ages[1] = 43;
        ages[2] = 78;
        ages[3] = 67;
        ages[4] = 42;
        String[] names = new String[2];
        names[0] = "Niraj";
        names[1] = "Dhiraj";
        System.out.println(names[0]);
        System.out.println(names[1]);
        // int ages[5]=10;// out of boundary
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println("but what if we need to print array of size like 1000 for this we us e loops");

    }

    public static void main(String[] args) {
        a96_access_1d_array s = new a96_access_1d_array();
        s.demoarray();
    }

}

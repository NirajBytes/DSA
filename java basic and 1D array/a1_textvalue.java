//***************  HOW TEXT AND VALUES WORKS IN JAVA ************//
class a1_textvalue {
    public static void main(String[] args) {
        int x = 5, y = 8, z = 10;
        System.out.println("x");
        System.out.println(x);
        System.out.println("x+y");
        System.out.println(x + y);
        System.out.println("x+y+z");
        System.out.println(x + y + z);
        System.out.println("MST CHIZ " + x + y + z);// ye code integer ko text me convert krke dono ko as one text
                                                    // dikhata O/p deta hai
        System.out.println(+x + y + "" + z);// this means to say that computer always read this from left to right
        System.out.println(+x + "" + y + z);// also explain above points
    }
}
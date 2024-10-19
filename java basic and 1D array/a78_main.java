//MULTIPLE OBJECTS     
class Student {
    int roll_number;
    String name;
}
public class a78_main {
    public static void main(String[] args) {
        Student id1 = new Student();
        id1.roll_number = 22005032;
        id1.name = "Niraj";
        System.out.println(id1.roll_number);
        System.out.println(id1.name);
        Student id2 = new Student();
        id2.roll_number = 220050;
        id2.name = "cse";
        System.out.println(id2.roll_number);
        System.out.println(id2.name);
    }
}
// only one class is public only

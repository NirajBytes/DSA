import java.util.Scanner;

class a86_constructor {
    int a, b;

    a86_constructor(int x, int y) {
        a = x;
        b = y;
        System.out.println("contructor of a83_constructor class called");
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int multiply() {
        return a * b;
    }

    public static void main(String[] args) {
        a86_constructor s = new a86_constructor(5, 7);
        System.out.println(s.add());
        System.out.println(s.sub());
        System.out.println(s.multiply());
        a86_constructor s1 = new a86_constructor(10, 7);
        System.out.println(s1.add());
        System.out.println(s1.sub());
        System.out.println(s1.multiply());
    }
}
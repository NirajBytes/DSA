class algebra {

    int add() {
        int a = 19, b = 16;//////////////
        return a + b;
    }

    int sub() {
        int a = 22, b = 13;
        return a - b;
    }
}

public class a89_Method_Level_Scope_of_variables {
    public static void main(String[] args) {
        algebra s = new algebra();
        System.out.println(s.add());
        System.out.println(s.sub());
    }
}

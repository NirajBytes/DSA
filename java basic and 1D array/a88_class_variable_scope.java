class algebra{
    int a=19,b=10;//********** */
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
}

public class a88_class_variable_scope {
    public static void main(String[] args) {
        algebra s=new algebra();
        System.out.println(s.add());
        System.out.println(s.sub());
    }
}

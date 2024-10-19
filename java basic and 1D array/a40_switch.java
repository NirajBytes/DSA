import java.util.Scanner;

public class a40_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DAY NUMBER");
        int day=sc.nextInt();
        switch(day){
            case 1: System.out.println("Today is MONDAY");break;
            case 2: System.out.println("Today is TUESDAY");break;
            case 3: System.out.println("Today is WEDNESDAY");break;
            case 4: System.out.println("Today is THURSDAY");break;
            case 5: System.out.println("Today is FRIDAY");break;
            case 6: System.out.println("Today is SATURDAY");break;
            case 7: System.out.println("Today is SUNDAY");break;
            default:System.out.println("INVALID ENTRY");

        }
    }
}

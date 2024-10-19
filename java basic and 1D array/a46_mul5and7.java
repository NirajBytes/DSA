// import java.util.Scanner;

/*******PRINT THE FIRST MULTIPLE OF 5 WHICH IS ALSO MULTIPLR OF 7 **************/
public class a46_mul5and7 {
  public static void main(String[] args) {

    // WHILE LOOP
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
//     int n=1;

//     while(true){
//         if((n%5==0) && (n%7==0)){
//             System.out.println(n+" is first multiple of 5 and 7");
//         break ;
//         }
//         n++;
//     }
// FOR LOOP
myloop:for(int i=1;;i++){
    if((i%5==0)&&(i%7==0)){
        System.out.println(i+" is divisible by 5 and 7");

        break myloop;
    }
    
}
  }  
}

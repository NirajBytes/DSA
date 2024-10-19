//Find the sum of the following series

//S=1-2+3-4... n

import java.util.Scanner;

public class a54_sum_series {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");// 5
    int n = sc.nextInt();
    // int ans=0;
    // for(int i=1;i<=n;i++){
    // if(i%2==0){
    // ans-=i;

    // }
    // else{
    // ans+=i;
    // }
    // }
    // System.out.println(ans);
    // WHILE LOOP
    int ans = 0;
    int i = 0;
    while (i <= n) {
      if (i % 2 == 0) {
        ans -= i;

      } else {
        ans += i;
      }
      i++;
    }
    System.out.println(ans);
  }
}

//sum of first n natual number without formula
public class a4_ques4 {
    public static void main(String[] args) {
        int  n=1900;
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum++;
            }
        }
        System.out.println("YOUR SUM IS :" +sum);
    }
}
// Time complexity O(n^2)
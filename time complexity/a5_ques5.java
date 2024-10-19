public class a5_ques5 {
    public static void main(String[] args) {
        int n =4,m=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.sqrt(n); j++) {
                System.out.println("hello");
                m++;
                
            }
        }
        System.out.println(m);
    }
}

// Time complexity O(n*n^1/2)
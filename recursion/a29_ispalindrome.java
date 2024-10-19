public class a29_ispalindrome {
    static boolean isplaindrome(String s,int l,int r){
        //base case 
        if (l>=r) {
            return true;
        }
        return (s.charAt(l)==s.charAt(r) && isplaindrome(s, l+1, r-1));
        }
    public static void main(String[] args) {
        String s="level";
       
        if (isplaindrome(s, 0, s.length()-1))
            System.out.println("is palindrome");
        else
        System.out.println("is not palindrome");
    }
}

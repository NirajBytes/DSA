public class a25_reverse {
    static String reverse(String s,int idx){
        //base case 
        if (idx==s.length()) return "";
        // recursive work
        // String sm=reverse(s, idx+1);
        // //self work
        // return sm+s.charAt(idx);
        return reverse(s, idx+1)+s.charAt(idx);

    }
    public static void main(String[] args) {
        String s="niraj";
        System.out.println(reverse(s, 0));

    }
}
 
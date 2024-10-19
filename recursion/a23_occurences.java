public class a23_occurences {
    static String remove_a(String s, int idx){
        int n=s.length();
        //base case
        if (idx==n) {
            return " ";
        }
        //recursive work
      String Smallans= remove_a(s, idx+1);
      char curr=s.charAt(idx);
       if (curr!='a') {
        return curr+Smallans;
       }
       else{
        return Smallans;
       } 


    }
    public static void main(String[] args) {
        String s="abcax";
        System.out.println(remove_a(s, 0));

    }
}

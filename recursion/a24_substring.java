public class a24_substring {
    static String remove(String s){
        if (s.length()==0) {
            return " ";
        }
        String Smallans=remove(s.substring(1));
        char curr=s.charAt(0);
        if (curr!='a') {
         return curr+Smallans;
        }
        else{
         return Smallans;
        } 
 
    }

    public static void main(String[] args) {
        String s="college wallah";
        System.out.println(remove(s));
        
    }
}

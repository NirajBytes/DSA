public class a26_substring {
        static String reverse(String s){
            //base case 
            if (0==s.length()) return "";
            // recursive work
            String sm=reverse(s.substring(1));
            // //self work
            return sm+s.charAt(0);
    
        }
        public static void main(String[] args) {
            String s="niraj";
            System.out.println(reverse(s));
    
        }
    }
     
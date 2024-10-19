import java.util.ArrayList;

public class a30_subseque {
    static ArrayList<String> ssq(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);// a
        ArrayList<String> sm = ssq(s.substring(1));
        // sm=["bc","b","c"," "]
        // ans=["bc","abc","b","ab","c","ac","","a"]
        for (String string : sm) {
            ans.add(string);// ""
            ans.add(curr + string);// "a"
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<String> ans = ssq("abc");
        for (String string : ans) {
            System.out.println(string);
        }
    }

}
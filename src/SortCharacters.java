import java.util.*;

public class SortCharacters {
    public static String solve(String str){
        char[] Char_arr = str.toCharArray();
        Arrays.sort(Char_arr);

        String ans = new String(Char_arr);
        return ans;

    }
    public static void main(String[] args) {
        String str = "ecbda";
        System.out.println(solve(str));
    }
}
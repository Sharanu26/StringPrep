import java.util.*;

public class sumNumber {

    public static int solve(String str){
        String tempsum = "0";
        int sum = 0;

        for(int i =0; i<str.length();i++){
            char s = str.charAt(i);

            if(Character.isDigit(s))
                tempsum = tempsum + s;
            else{
                sum = sum  + Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        return sum + Integer.parseInt(tempsum);
    }



    public static void main(String[] args) {
        String str = "1ada34nsdguyd2";
        System.out.println(solve(str));
    }
}

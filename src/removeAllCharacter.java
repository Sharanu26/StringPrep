import com.sun.security.jgss.GSSUtil;

public class removeAllCharacter {

    public static String solve(String str, int n){

        StringBuffer ans = new StringBuffer();

        for(int i =0; i<n; i++){
            int ascii = str.charAt(i);

            if(ascii >= 65 && ascii <= 90  ||  ascii >= 97 && ascii <= 122 )
                ans.append(str.charAt(i));
        }

        return ans.toString();
    }



    public static void main(String[] args) {
        String str = "take$ u &us ^dojdsf";
        int n = str.length();

        System.out.println(solve(str,n));
    }
}

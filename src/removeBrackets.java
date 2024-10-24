public class removeBrackets {

    public  static  String solve(String input){
        StringBuffer ans = new StringBuffer();

        for(int i=0; i<input.length() ; i++){
            if(input.charAt(i) != '(' && input.charAt(i) != ')')
                ans.append(input.charAt(i));
        }

        return ans.toString();
    }



    public static void main(String[] args) {
        String input = "adasf(JNOL)nJKV)";
        System.out.println(solve(input));
    }

}

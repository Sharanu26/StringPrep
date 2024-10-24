public class ReverseWord {
    public static String Reverse(String str) {
        StringBuffer res = new StringBuffer();

        int startidx = str.length()-1;
        while(startidx >= 0){
            while(startidx >= 0 && str.charAt(startidx) == ' '){
                startidx--;
            }
            if(startidx < 0){
                break;
            }
            int endidx = startidx;
            while(startidx >=0 && str.charAt(startidx) != ' '){
                startidx--;
            }
            if(res.length() == 0){
                res.append(str.substring(startidx+1,endidx+1));
            }else{
                res.append(" ");
                res.append(str.substring(startidx+1,endidx+1));
            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        String str = "My name is sharanu";
        System.out.println(str);
        System.out.println("after reversing word is: ");
        System.out.println(Reverse(str));

    }
}

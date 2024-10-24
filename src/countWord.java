public class countWord {
    public static void main(String[] args) {
        String str = "HIA MYAN DAY";
        int n = str.length();
        int spaces = 0;

        for(int i =0;i<n;i++){
            if(str.charAt(i) == ' ')
            spaces = spaces + 1;
        }
        System.out.print("word in the string is: ");
        System.out.print(spaces + 1);

    }
}

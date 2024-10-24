public class vowels {
    public static void solve(String str, int length){
        int vowel = 0 , consonants=0, whitespaces=0;
        str = str.toLowerCase();// converting giver string to lower case

        for(int i=0; i<length ; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
            vowel++;

            else if(ch >= 'a' && ch <= 'z')
                consonants++;

            else if (ch == ' ')
                whitespaces++;

        }
        System.out.println("Vowels: " + vowel);
        System.out.println("consonants: " + consonants);
        System.out.println("whitespaces: " + whitespaces);


    }
    public static void main(String[] args) {
        String str = "Sharanu Halle";
        int length = str.length();
        solve(str,length);

    }
}

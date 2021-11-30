package pangram;

import java.util.Locale;

//A pangram is a sentence containing every letter in the English Alphabet (a-z).
public class Pangram {

    static boolean isPangram(String s){
        s = s.toLowerCase(Locale.ROOT);
        for(int i =0; i< 26; i++){ //a-z holds 26 letters
            if (!s.contains(String.valueOf((char) (i+97)))) { // (char)97 = 'a'
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("Quick brown fox jumps over the lazy dog"));
    }

}

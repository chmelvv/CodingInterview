/** A palindrome is a word, number, phrase, or other sequence of characters which reads the same
 * backward as forward, such as madam or racecar or the number 10801.
 */
public class Palindrom {

    static boolean isPalindrom(Integer line){
        String str = String.valueOf(line);
        return isPalindrom(str);
    }

    private static boolean isPalindrom(String str) {
        int length = str.length();
        //check symmetric symbols from start and the end
        for(int i=0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length - i -1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(10801));
        System.out.println(isPalindrom(1081));
        System.out.println(isPalindrom(1));
        System.out.println(isPalindrom(11));
        System.out.println(isPalindrom("KAZAK"));
        System.out.println(isPalindrom("KAZKA"));
    }

}

/** In an Armstrong number (also known as narcissistic number), is a number that is the sum of its
  own digits each raised to the power of the number of digits.
 xy...z = x^n + y^n + ... + z^n
 where n is the number of digits in a number.

 Few examples are: 153, 371, 407, 8208, etc
 153 = 1^3 + 5^3 + 3^3
 8208 = 8^4 + 2^4 + 0^4 + 8^4
 */
public class Armstrong {
    static boolean isArmstrongNumber(int number){
        String str = String.valueOf(number);
        int length = str.length();
        int sum = 0;
        for (int i = 0; i < length; i++){
            sum += Math.pow(Integer.parseInt(str.substring(i,i+1)), length);
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(407));
        System.out.println(isArmstrongNumber(8208));
    }
}

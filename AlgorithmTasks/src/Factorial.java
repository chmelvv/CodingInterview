public class Factorial {
    static int factorialViaCycle(int n){
        if (n == 0) {
            return 0;
        }

        int result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }

    static int factorialViaRecursion(int n){
        if (n == 1) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        return n * factorialViaRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialViaCycle(0));
        System.out.println(factorialViaCycle(1));
        System.out.println(factorialViaCycle(2));
        System.out.println(factorialViaCycle(5));

        System.out.println(factorialViaRecursion(0));
        System.out.println(factorialViaRecursion(1));
        System.out.println(factorialViaRecursion(2));
        System.out.println(factorialViaRecursion(5));
    }

}

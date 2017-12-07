public class Exc13_13 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if ( isPrime(i) )
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {

        boolean result = true;

        for (int i = 2; i < n ; i++) {

            if (n % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
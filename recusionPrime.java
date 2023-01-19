public class recusionPrime {
    static boolean isPrime(int n, int i) {
        if (n % i == 0) {
            return false;
        }
        // } else {
        // isPrime(n, i + 1);
        // return true;
        // }
        // if(i == n-1){
        // return true;
        // }
        // return isPrime (n,i+1);
        return true;

    }

    public static void main(String[] args) {
        boolean result = isPrime(176, 2);
        System.out.println(result);
    }

}

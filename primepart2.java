public class primepart2 {
    public static void main(String[] args) {
        int num = 997;
        boolean prime = true;
        int count = 0;
        // for (int i = 2; i < num/2; i++) {
        // count++;
        // if (num % i == 0) {
        // prime = false;
        // break;
        // }
        // }
        for (int i = 2; i * i < num; i++) {
            count++;
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(" look " + count + " iterations.....");
        if (prime) {
            System.out.println("number is prime...");
        } else {
            System.out.println("number is not prime....");
        }
    }

}

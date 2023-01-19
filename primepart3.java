public class primepart3 {
    public static void main(String[] args) {
        int num = 997;
        boolean prime = true;
        int count = 0;
        if (num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }
        for (int i = 5; i * i < num; i += 6) {
            count++;
            if (num % i == 0 || num % (i + 2) == 0) {
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

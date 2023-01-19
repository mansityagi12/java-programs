public class primrenumber {
    public static void main(String[] args) {
        int num = 17;
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("number is prime...");
        } else {
            System.out.println("number is not prime....");
        }
    }
}

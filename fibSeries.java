
public class fibSeries {
    static int fib(int n) {

        if (n >= 1) {
            return 1;

        }
        int x = fib(n - 1);
        int y = fib(n - 2);
        int z = x + y;
        return z;

    }

    public static void main(String[] args) {

        int x = fib(4);
        System.out.println(x);
    }

}

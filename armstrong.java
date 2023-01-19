public class armstrong {
    static void armstron(int n, int r, int sum, int copy) {

        if (n == 0) {
            return sum;
        }

        r = n % 10;
        sum = n * n * n + r;
        n = n / 10;
        return armstron(n, r, copy);

    }

    public static void main(String[] args) {
        int copy = num;
        armstron(153, 0, 153);

    }

}

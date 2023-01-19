import java.util.Scanner;

// import javax.swing.text.html.HTMLDocument.RunElement;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");

        System.out.println("Enter your choice");
        int ch = scanner.nextInt();
        System.out.println("Enter first num");
        int fnum = scanner.nextInt();
        System.out.println("enter second num");
        int snum = scanner.nextInt();
        int result = 0;
        switch (ch) {
            case 1:
                result = fnum + snum;
                break;
            case 2:
                result = fnum - snum;
                break;
            case 3:
                result = fnum / snum;
                break;
            case 4:
                result = fnum * snum;
                break;
            default:
                System.out.println("invalid number");
                break;
        }
        System.out.println("result is :" + result);
        scanner.close();

    }

}

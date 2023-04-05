import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number) {
        int temp = number;
        int reverse = 0;
        int lastNumber;

        while (temp != 0) {

            lastNumber = temp % 10;
            reverse = reverse * 10 + lastNumber;
            temp /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrom(number));
    }
}

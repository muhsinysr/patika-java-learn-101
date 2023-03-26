import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0) {
                total += n;


            }
        } while (n > 0);
        System.out.println("Toplam: " + total);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taban ve üs değerlerini kullanıcıdan al
        System.out.print("Taban değerini girin: ");
        double base = scanner.nextDouble();

        System.out.print("Üs değerini girin: ");
        int exponent = scanner.nextInt();

        // Üslü sayıyı hesapla
        double result = 1;
        for (int i = 1; i <= exponent; ++i) {
            result *= base;
        }

        // Sonucu ekrana yazdır
        System.out.println(base + " üzeri " + exponent + " = " + result);
    }
}

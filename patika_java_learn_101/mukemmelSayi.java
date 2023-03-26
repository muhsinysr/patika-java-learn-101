import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int mukemmelsayimi = sc.nextInt();

        int toplam = 0;

        for (int i = 1; i < mukemmelsayimi; i++) {
            if (mukemmelsayimi % i == 0) {
                toplam +=i;
            }
            else {
                System.out.println("Sayı mükemmel sayı değildir.");
                break;
            }
            if (toplam == mukemmelsayimi) {
                System.out.println(mukemmelsayimi + " sayısı mükemmel sayıdır.");
            }
            else {
                System.out.println(mukemmelsayimi + " sayısı mükemmel sayı değildir.");
            }
        }

    }
}
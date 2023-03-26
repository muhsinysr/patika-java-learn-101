import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayiGirdisi;
        System.out.print("Kaç sayı gireceksiniz ? : ");
        sayiGirdisi = scanner.nextInt();

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <= sayiGirdisi; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            int sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

        }
        System.out.println("En büyük sayı : " + enBuyuk);
        System.out.println("En küçük sayı : " + enKucuk);
    }
}
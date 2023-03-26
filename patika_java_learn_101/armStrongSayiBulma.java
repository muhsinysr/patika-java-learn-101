import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz ");
        int sayi = input.nextInt();

        int gecici = sayi;
        int basamakSayisi = 0;

        while (sayi != 0) {
            basamakSayisi++;
            sayi = sayi / 10;
        }

        gecici = sayi;
        int sonuc = 0;

        while (sayi != 0) {
            int basamakDegeri = gecici % 10;
            sonuc += Math.pow(basamakDegeri, basamakSayisi);
            sayi = sayi / 10;
        }

        if (sonuc == sayi) {
            System.out.println(sayi + "Bir amstrong sayısıdır.");
        }
        else {
            System.out.println(sayi + " Bir armstrong sayısı değildir");
        }

    }
}
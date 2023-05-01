import java.util.Scanner;

public class HarmonikOrtalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        // dizi elemanlarını alalım
        double[] dizi = new double[n];
        System.out.print("Dizinin elemanlarını aralarında boşluk bırakarak giriniz: ");
        for (int i = 0; i < n; i++) {
            dizi[i] = input.nextDouble();
        }

        // Harmonik seri hesabı
        double harmonik_seri = 0;
        for (int i = 0; i < n; i++) {
            harmonik_seri += 1 / dizi[i];
        }

        // Harmonik ortalamayı hesaplayalım
        double harmonik_ortalama = n / harmonik_seri;

        // Sonucu ekrana yazdıralım
        System.out.println("Dizinin harmonik ortalaması: " + harmonik_ortalama);
    }
}

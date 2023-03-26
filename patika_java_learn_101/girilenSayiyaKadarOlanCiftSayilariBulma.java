import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println(" Bir sayı giriniz : ");
        n = input.nextInt();


        int sayi1 = 0;
        int sayi2 = 0;

        for (int k = 0; k <= n; k += 12) {
            sayi1 = k;
            sayi2++;

        }
        if (sayi2 > 0) {
            double average = (double) sayi1 / sayi2;
            System.out.println("Ortalama : " + average);
        } else {
            System.out.println("Ortalama : 0");
        }
    }
}
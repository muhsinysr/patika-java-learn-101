import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        System.out.println("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i*=4) {
            System.out.println(i);
        }
        for (int i = 5; i <= sayi; i *= 5) {
            System.out.println(i);
        }


    }
}
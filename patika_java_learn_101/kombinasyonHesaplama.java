import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        int sayi2 = input.nextInt();

        if (sayi1 > 0 || sayi2 > 0 || sayi2>sayi1)  {
            System.out.println("Sayılar doğru girildi.");
        } else {
            System.out.println("Sayılar yanlış girildi.");
        }

        int result = (sayi1) / ((sayi2) * (sayi1 - sayi2));
        System.out.println("C ( " + sayi1 + " , " + sayi2 + " ) = " + result);



    };

}
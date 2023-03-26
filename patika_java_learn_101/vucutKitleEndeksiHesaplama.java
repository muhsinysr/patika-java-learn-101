import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int boy;
        double kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz :");
        boy = input.nextInt();

        System.out.println("Kilonuzu Giriniz :");
        kilo = input.nextDouble();



        double vucutKitleEndeksi = (kilo) / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz Şudur :" + vucutKitleEndeksi);
    }
}
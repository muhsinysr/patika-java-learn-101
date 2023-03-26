import  java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, baslangicFiyati= 10.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = (perKM*km);
        total += baslangicFiyati;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }
}

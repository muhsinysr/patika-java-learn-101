import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matematik, fizik, kimya, turkce, tarih, muzik = 0;
    int dersSayisi=6;
    int toplamNot=0;

    System.out.print("Matematik notunuzu giriniz: ");
    int not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        matematik = not;
        toplamNot += matematik;
        dersSayisi++;

    } else {
        System.out.println("Geçersiz not girdiniz.");
        return;
    }
    matematik = sc.nextInt();

    System.out.print("Fizik notunuzu giriniz: ");
    not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        fizik = not;
        toplamNot += fizik;
        dersSayisi++;

    } else {
        System.out.println("Geçersiz not girdiniz.");
        return;
    }

    System.out.print("Kimya notunuzu giriniz: ");
    not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        kimya = not;
        toplamNot += kimya;
        dersSayisi++;

    } else {
        System.out.println("Geçersiz not girdiniz.");
        return;
    }

    System.out.print("Türkçe notunuzu giriniz: ");
    not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        turkce = not;
        toplamNot += turkce;
        dersSayisi++;

    } else {
        System.out.println("Geçersiz not girdiniz.");
        return;
    }
    System.out.print("Tarih notunuzu giriniz: ");
    not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        tarih = not;
        toplamNot += tarih;
        dersSayisi++;

    } else {
        System.out.println("Geçersiz not girdiniz.");
        return;
    }

    System.out.print("Müzik notunuzu giriniz: ");
    not = sc.nextInt();
    if (not >= 0 && not <= 100) {
        muzik = not;
        toplamNot += muzik;
        dersSayisi++;

    }
    double ortalama = toplamNot / dersSayisi;

    if (ortalama >= 60) {
        System.out.println("Sınıfı Geçtiniz. Ortalamanız: " + ortalama);
    } else {
        System.out.print("Sınıfta Kaldınız. Ortalamanız: " + ortalama + " Kaldığınız Dersler: ");

        if (matematik < 0 || matematik > 100) {
            System.out.print("Matematik ");
        }
        if (fizik < 0 || fizik > 100) {
            System.out.print("Fizik ");
        }
        if (kimya < 0 || kimya > 100) {
            System.out.print("Kimya ");
        }
        if (turkce < 0 || turkce > 100) {
            System.out.print("Türkçe ");
        }
        if (tarih < 0 || tarih > 100) {
            System.out.print("Tarih ");
        }
        if (muzik < 0 || muzik > 100) {
            System.out.print("Müzik ");
        }
        else {
            System.out.println("Yanlış bir şeyler var.");
        }
    }

    }
}
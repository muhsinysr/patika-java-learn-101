import java.util.Scanner;

public class KullaniciGirisiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi;
        String sifre;

        System.out.print("Kullanıcı adınızı giriniz : ");
        kullaniciAdi = input.nextLine();

        System.out.println("Şifreyi Giriniz :");
        sifre = input.nextLine();

        if (kullaniciAdi.equals(("mussin")) && sifre.equals(("yapamamki"))) {
            System.out.println("Giriş Başarılı!");
        }
        else {
            System.out.println("Giriş Başarısız!");
            System.out.println("Şifreniz Yanlış, şifre değiştirmek ister misiniz? (E/H) :");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.println("Yeni Şirenizi Giriniz");
                String YeniSifre = input.nextLine();
                if (YeniSifre.equals(kullaniciAdi)) {
                    System.out.println("Girilen Şifre Eski Şifre ile Aynı Olamaz");
                }
                else {
                    sifre = YeniSifre;
                    System.out.println("Şifre oluşturuldu.");
                }

            }
        }

        input.close();
    }
}

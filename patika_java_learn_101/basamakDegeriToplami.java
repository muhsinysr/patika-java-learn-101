import java.util.Scanner;
public class Main {
    // Kullanıcıdan alınan bir tam sayının basamak sayılarının toplamını hesaplayan program
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Kullanıcıdan input almak için Scanner sınıfından bir nesne oluşturduk

            int sayi, gecici, toplam = 0, basamak; // Değişkenler tanımlandı

            System.out.print("Bir tam sayi giriniz: ");
            sayi = input.nextInt(); // Kullanıcıdan bir sayı alındı

            gecici = sayi; // gecici değişken sayıya eşitlendi

            while (gecici != 0) {
                basamak = gecici % 10; // gecici değişkenin son basamağı bulundu
                toplam += basamak; // toplam değişkenine basamağın değeri eklendi
                gecici /= 10; // gecici değişkeni bir sonraki basamağa geçirildi
            }

            System.out.println("Girilen sayinin basamak sayilarinin toplami: " + toplam); // Sonuç ekrana yazdırıldı

            input.close(); // Scanner nesnesini kapatıyoruz
        }
    }


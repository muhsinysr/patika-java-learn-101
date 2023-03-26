import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner bos = new Scanner(System.in);

        int bankaSifresi = 1234;
        System.out.print("Banka şifrenizi girin :");
        bankaSifresi = bos.nextInt();

        for (int i = 0; i < 3; i++) {
            if (bankaSifresi == 1234) {
                System.out.println("Şifre Doğru");
                while (true)  {
                    System.out.println("1- Para Yatırma");
                    System.out.println("2- Para Çekme");
                    System.out.println("3- Bakiye Sorgulama");
                    System.out.println("4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    int islem = bos.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("Para Yatırma");
                            break;

                        case 2:
                            System.out.println("Para Çekme");
                            break;

                        case 3:
                            System.out.println("Bakiye Sorgulama");
                            break;

                        case 4:
                            System.out.println("Çıkış Yapılıyor");
                            break;

                    }

                    break;

                }
                System.out.println("İşleminiz gerçekleştirildi. İyi günler dileriz.");
                break;

            } else {
                System.out.println("Şifre Yanlış");
                System.out.print("Banka şifrenizi girin :");
                bankaSifresi = bos.nextInt();
            }
            if (i == 2) {
                System.out.println("Şifre 3 kere yanlış girildi. Hesabınız bloke edildi. Lütfen bankayla iletişime geçiniz.");
            }



        }
    }
}
 
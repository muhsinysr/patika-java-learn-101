import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int day;
        String month;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz:");
        day = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz:");
        month = input.next();

        if (month.equals("Ocak")  ) {
            if (day >= 1 && day <= 22) {
                burc = "Oğlak";
                System.out.println("Burcunuz: " + burc);
                ;
            }
        else if (day >= 23 && day <= 31) {
                burc = "Kova";
                System.out.println("Burcunuz: " + burc);
            }
            else {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }
        if (month.equals("Şubat")) {
            if (day >= 1 && day <= 19) {
                burc = "Kova";
                System.out.println("Burcunuz: " + burc);
            }
                else if (day >= 20 && day <= 29) {
                    burc = "Balık";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
        if (month.equals("Mart")) {
            if (day >= 1 && day <= 20) {
                burc = "Balık";
                System.out.println("Burcunuz: " + burc);
            }
            else if (day >= 21 && day <= 31) {
                burc = "Koç";
                System.out.println("Burcunuz: " + burc);
            }
            else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
        if (month.equals("Nisan")) {
            if (day >= 1 && day <= 20) {
                burc = "Koç";
                System.out.println("Burcunuz: " + burc);

            }
            else if (day >= 21 && day <= 30) {
                burc = "Boğa";
                System.out.println("Burcunuz: " + burc);
            }
            else {
                System.out.println("Hatalı giriş yaptınız.");
            }
            if (month.equals("Mayıs")) {
                if (day >= 1 && day <= 21) {
                    burc = "Boğa";
                    System.out.println("Burcunuz: " + burc);
                }
                else if ( day >= 22 && day <= 31 )  {
                    burc = "İkizler";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");

                }

            }
            if (month.equals("Haziran")) {
                if (day >= 1 && day <= 22) {
                    burc = "İkizler";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 23 && day <= 30) {
                    burc = "Yengeç";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Temmuz")) {
                if (day >= 1 && day <= 22) {
                    burc = "Yengeç";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 23 && day <= 31) {
                    burc = "Aslan";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Ağustos")) {
                if (day >= 1 && day <= 22) {
                    burc = "Aslan";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 23 && day <= 31) {
                    burc = "Başak";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Eylül")) {
                if (day >= 1 && day <= 22) {
                    burc = "Başak";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 23 && day <= 30) {
                    burc = "Terazi";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Ekim")) {
                if (day >= 1 && day <= 22) {
                    burc = "Terazi";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 23 && day <= 31) {
                    burc = "Akrep";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Kasım")) {
                if (day >= 1 && day <= 21) {
                    burc = "Akrep";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 22 && day <= 30) {
                    burc = "Yay";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (month.equals("Aralık")) {
                if (day >= 1 && day <= 21) {
                    burc = "Yay";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 22 && day <= 31) {
                    burc = "Oğlak";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (day >= 22 && day <= 31) {
                burc = "Oğlak";
                System.out.println("Burcunuz: " + burc);
            }
            else {
                System.out.println("Hatalı giriş yaptınız.");
            }
            if (month.equals("Ocak")) {
                if (day >= 1 && day <= 19) {
                    burc = "Oğlak";
                    System.out.println("Burcunuz: " + burc);
                }
                else if (day >= 20 && day <= 31) {
                    burc = "Kova";
                    System.out.println("Burcunuz: " + burc);
                }
                else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
            }
            if (day > 31 && day < 1) {
                System.out.println("Hatalı giriş yaptınız.");
            }

        }


    }
}
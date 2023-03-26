import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        System.out.println("Ücret Tutarını Giriniz");

        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;

        System.out.print("Kdvsiz Tutar Şudur : " + tutar);
        System.out.print("Kdv Oranı Şudur : " + kdvOran);
        System.out.print("Kdv Tutarı Şudur : " + kdvTutar);
        System.out.print("Kdvli Fiyat Şudur : " + kdvliTutar);


    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    double aKosesi, bKosesi;

    int cKosesi;

    Scanner girdi = new Scanner(System.in);

    System.out.print ("1 Kenarı Giriniz : ");
    aKosesi = girdi.nextInt();

    System.out.print("2. Kenarı Giriniz :");
    bKosesi = girdi.nextInt();

    cKosesi = (int) Math.sqrt((aKosesi*aKosesi) + (bKosesi*bKosesi));

    System.out.println("Hipotenüs :" + cKosesi);






    }

}
import java.util.HashMap;
import java.util.Scanner;

public class ManavHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> urunFiyatlari = new HashMap<String, Double>();
        urunFiyatlari.put("armut", 2.14);
        urunFiyatlari.put("elma", 3.67);
        urunFiyatlari.put("domates", 1.11);
        urunFiyatlari.put("muz", 0.95);
        urunFiyatlari.put("patlıcan", 5.0);

        double toplamTutar = 0.0;

        for (String urun : urunFiyatlari.keySet()) {
            System.out.printf("%s kaç kilogram? ", urun);
            double kg = input.nextDouble();
            toplamTutar += kg * urunFiyatlari.get(urun);
        }

        System.out.printf("Toplam tutar: %.2f TL\n", toplamTutar);
    }
}

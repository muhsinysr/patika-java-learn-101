public class kucuktenBuyugeElemanSiralama {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 2, 1, 4 };
        int n = numbers.length;

        // Diziyi küçükten büyüğe sıralayalım
        for (int i = 0; i < n; i++) {
            // i. elemandan sonraki elemanları kontrol edelim
            for (int j = i + 1; j < n; j++) {
                // i. eleman j. elemandan büyükse yer değiştirelim
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Diziyi ekrana yazdıralım
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
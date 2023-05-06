import java.util.HashMap;
import java.util.Scanner;

public class SayiFrekansiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int currentNumber = numbers[i];
            if (frequencyMap.containsKey(currentNumber)) {
                frequencyMap.put(currentNumber, frequencyMap.get(currentNumber) + 1);
            } else {
                frequencyMap.put(currentNumber, 1);
            }
        }

        System.out.println("Elemanların frekansları:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " sayısı " + frequencyMap.get(key) + " kez tekrar edildi.");
        }
    }
}


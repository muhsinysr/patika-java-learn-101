import java.util.Scanner;

public class elemanlarinMinMaksDegeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Hangi sayının en yakınını istiyorsunuz?: ");
        int target = input.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestGreater = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < target && numbers[i] > closestSmaller) {
                closestSmaller = numbers[i];
            }
            if (numbers[i] > target && numbers[i] < closestGreater) {
                closestGreater = numbers[i];
            }
        }

        if (closestSmaller == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        }

        if (closestGreater == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük bir sayı yok.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestGreater);
        }
    }
}

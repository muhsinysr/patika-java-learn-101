import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101);
        int guess;
        int numberOfGuesses = 0;

        System.out.println("0 ile 100 arasında bir sayı tahmin edin.");

        do {
            System.out.print("Tahmininizi girin: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < randomNumber) {
                System.out.println("Daha büyük bir sayı tahmin edin.");
            } else if (guess > randomNumber) {
                System.out.println("Daha küçük bir sayı tahmin edin.");
            }
        } while (guess != randomNumber);

        System.out.println("Tebrikler, " + numberOfGuesses + " tahminde doğru sayıyı buldunuz!");
    }
}

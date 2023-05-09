import java.util.Scanner;

public class palindromsayibulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine();

        boolean palindromik = true;

        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - i - 1)) {
                palindromik = false;
                break;
            }
        }

        if (palindromik) {
            System.out.println(kelime + " palindromik bir kelime.");
        } else {
            System.out.println(kelime + " palindromik bir kelime değil.");
        }
    }
}

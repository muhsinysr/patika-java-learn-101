import java.util.Scanner;

public class matrisHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz: ");
        int m = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Matrisin elemanlarını giriniz: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrisin transpozu: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

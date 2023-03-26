import  java.util.Scanner
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Faktöriyel Sayısı :");
        int n = sc.nextInt();
        int total = 1;


        for (int i = 1; i<n; i++) {

            total = total   * i;

            System.out.println("Faktöriyel : " + total);


        }

    }
}
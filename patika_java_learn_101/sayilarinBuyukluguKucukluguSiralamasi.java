import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    } {

        Scanner sc = new Scanner(System.in);
        int a, b, c ;
                System.out.println("Enter a number: ");
                a = sc.nextInt();

                System.out.println("Enter b number: ");
                b = sc.nextInt();

                System.out.println("Enter c number: ");
                c = sc.nextInt();

                if (a > b && a > c) {
                    System.out.println("a is the largest number");
                } else if (b > a && b > c) {
                    System.out.println("b is the largest number");
                } else if (c > a && c > b) {
                    System.out.println("c is the largest number");
                } else {
                    System.out.println("a, b, c are equal");

                }
                        




    }
    
}
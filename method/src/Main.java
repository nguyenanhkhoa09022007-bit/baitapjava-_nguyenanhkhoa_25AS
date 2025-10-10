import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = scanner. nextInt();
        System.out.println("nhap so b");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(" so lon la " + a);
        } else if (b > a) {
            System.out.println(" so lon la " + b);
        }


    }
}
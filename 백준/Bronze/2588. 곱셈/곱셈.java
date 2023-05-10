import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = b%10;
        int num2 = b%100-b%10;
        int num3 = b%1000-b%100;

        System.out.println(a * num);
        System.out.println(a * num2/10);
        System.out.println(a * num3/100);

        System.out.println((a*num)+(a*num2)+(a*num3));

    }
}
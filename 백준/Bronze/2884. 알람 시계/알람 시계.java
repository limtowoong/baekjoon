import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(0 <= H && H <= 24 && 0 <= M && M <= 59) {
            if (M - 45 < 0) {
                M += 60;
                H--;
            }
            M -= 45;
            if (H < 0) {
                H += 24;
            }
            System.out.println(H + " " + M);
        }
    }
}
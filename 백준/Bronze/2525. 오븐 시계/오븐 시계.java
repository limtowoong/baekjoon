import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(0 <= A && A <= 24 && 0 <= B && B <= 59) {
            if(0 <= C && C <= 1000) {
                while(B + C >= 60) {
                    A++;
                    C -= 60;
                }
                B += C;
                if(A >= 24){
                    A -= 24;
                }
                System.out.println(A+" "+B);
            }
        }
    }
}
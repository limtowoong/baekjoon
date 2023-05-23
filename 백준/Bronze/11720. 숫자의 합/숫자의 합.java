import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int num=0;
        for(int i=0; i<N; i++){
           num += S.charAt(i) - 48;
        }
        System.out.println(num);
    }
}
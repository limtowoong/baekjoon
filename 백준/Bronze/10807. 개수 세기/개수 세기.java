import java.lang.reflect.Array;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] v = new int[N];
        int num = 0;

        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            v[i] = a;
        }
        int b = sc.nextInt();
        for (int i=0; i<N; i++) {
            if(v[i] == b){
                num++;
            }
        }

        System.out.println(num);
    }
}
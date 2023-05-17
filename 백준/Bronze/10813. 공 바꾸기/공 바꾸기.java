import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] basket = new int[N];

        for(int i=0; i<N; i++) {
                basket[i] = i+1;
            }
        int M = sc.nextInt();
        int num = 0;
        for(int j=0; j<M; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            num = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = num;
        }

        for(int k=0; k<N; k++){
            System.out.print(basket[k]+" ");
        }

        }

}
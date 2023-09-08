import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int num;
        int[] arr = new int[N];

        for(int a=0; a<N; a++) {
            arr[a] = a+1;
        }

        for(int a=0; a<M; a++){

            int i = sc.nextInt();
            int j = sc.nextInt();

            num = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = num;

        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
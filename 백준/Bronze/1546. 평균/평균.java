import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer arr[] = new Integer[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        float M = arr[0];
        float hap = 0;
        for(int i=0; i<N; i++){
            hap += arr[i];
        }

        System.out.println((hap/N)/M*100);

    }
}
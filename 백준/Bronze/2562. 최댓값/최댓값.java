import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int[] arr2 = new int[9];
        int num = 0;

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int j=0; j<9; j++){
            num++;
            if(arr[9-1]==arr2[j]){
                System.out.println(arr2[j]);
                System.out.println(num);
            }
        }
    }
}
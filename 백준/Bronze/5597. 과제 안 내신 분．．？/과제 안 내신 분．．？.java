import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[30];
        for (int i = 0; i < 30; i++) {
            a[i] = i+1;
        }

        int b[] = new int[28];
        for (int i = 0; i < 28; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(b);
        
        int j = 0;
        for (int i = 0; i < 30; i++) {
            if (a[i] != b[j]) {
                System.out.println(a[i]);
                j--;
            }
            j++;
            if(j>27){
                j--;
            }
        }
    }
}
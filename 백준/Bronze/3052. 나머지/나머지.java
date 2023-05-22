import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[10];
        int num = 0;
        boolean bl;

        for(int i=0; i<10; i++) {
            a[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for(int i=0; i<10; i++) {
            bl = false;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    bl = true;
                    break;
                }
            }
            if(bl == false){
                num++;
            }
        }
        System.out.println(num);

    }
}
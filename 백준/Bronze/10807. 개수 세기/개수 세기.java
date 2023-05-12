
import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] v = new int[N];
        int num = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        int a = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            if(v[i] == a){
                num++;
            }
        }
        System.out.println(num);
    }
}
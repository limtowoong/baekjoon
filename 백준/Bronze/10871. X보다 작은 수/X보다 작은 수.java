
import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        StringTokenizer sg = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(sg.nextToken());
        }

        for (int i=0; i<N; i++) {
            if(A[i] < X){
                System.out.print(A[i]+" ");
            }
        }
    }
}
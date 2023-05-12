import java.io.*;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int j = Integer.parseInt(br.readLine());

    for(int i=0; i<j; i++) {
        st = new StringTokenizer((br.readLine()));
        bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
    }
    bw.close();
}
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int j, a, b;
    j = Integer.parseInt(br.readLine());

    for(int i=1; i<=j; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        sb.append(String.format("Case #%d: %d\n", i , a+b));
    }
    System.out.println(sb);
    }

}
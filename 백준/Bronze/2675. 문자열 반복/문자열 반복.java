import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int S = sc.nextInt();
            String C = sc.next();
            for(int j=0; j<C.length(); j++){
                for(int k=0; k<S; k++){
                    sb.append(C.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
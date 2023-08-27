import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char arr[][] = new char[5][15];
        int max = 0;

        for(int i=0; i<5; i++){
            String a = sc.next();
            if(max < a.length()) max = a.length();
            for(int j=0; j<a.length(); j++){
                arr[i][j] = a.charAt(j);
            }
        }

        for(int i=0; i< max; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] != '\0') {
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}
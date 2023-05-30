import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a[] = new int[26];
        for(int i=0; i<26; i++){
            a[i] = -1;
        }

        String b = sc.nextLine();

        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);

            if(a[ch - 97] == -1){
                a[ch - 97] = i;
            }
        }
        for( int c : a ){
            System.out.print(c+" ");
        }
    }
}
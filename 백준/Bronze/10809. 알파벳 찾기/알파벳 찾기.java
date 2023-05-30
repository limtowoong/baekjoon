import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int arr[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
            arr2[i] = i;
        }

        for(int i=0; i<a.length(); i++){
            for(int j=0; j<arr.length; j++){
                char ch = a.charAt(i);
                if(ch-97 == arr2[j] && arr[j] == -1){
                    arr[ch - 97] = i;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
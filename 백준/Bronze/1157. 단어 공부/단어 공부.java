import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = 0;
        }

        String b = sc.next().toUpperCase();

        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            arr[ch - 65] += 1;
        }

        Integer arr2[] = new Integer[26];

        for(int i=0; i<arr.length; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i=0; i< arr.length; i++) {
            if (arr2[0].equals(arr2[1])) {
                System.out.print('?');
                break;
            }
            if(arr2[0]==arr[i]){
                char ch = (char)(65+i);
                System.out.print(ch);
                break;
            }
        }
    }
}
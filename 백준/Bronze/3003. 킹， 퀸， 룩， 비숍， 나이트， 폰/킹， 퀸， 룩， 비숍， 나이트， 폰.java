import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arr[] = {1,1,2,2,2,8};

        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt();
            if(a < arr[i]){
                a = arr[i] - a;
                System.out.print(a+" ");
            }else if(a > arr[i]){
                a = a - arr[i];
                System.out.print(-a+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int type = sc.nextInt();
    int num2 = 0;

    for(int i=0; i<type; i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        num2 += a*b;
    }
    if(num == num2){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

}
}
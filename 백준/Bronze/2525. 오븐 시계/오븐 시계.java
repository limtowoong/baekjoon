import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int add = sc.nextInt();

        while(m + add >= 60){
            h++;
            m -= 60;
        }
        m += add;
        if(h >= 24){
            h -= 24;
        }
        System.out.print(h+" "+m);
        
    }
}
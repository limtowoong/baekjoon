import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String a = sc.next();
        int num = 0;
        boolean b = true;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'X') {
                num++;
            } else {
                if(num % 2 == 0) {
                    while (num >= 4) {
                        sb.append("AAAA");
                        num -= 4;
                    }
                    if (num == 2) {
                        sb.append("BB");
                        num -= 2;
                    }
                    sb.append(".");
                }else{
                    break;
                }
            }
        }
        if (num % 2 != 0) {
            System.out.print("-1");
            b = false;
        }
            while (num >= 4) {
                num -= 4;
                sb.append("AAAA");
            }
            if (num == 2) {
                sb.append("BB");
            }

            if (b == true) {
                System.out.print(sb);
            }
        }
    }
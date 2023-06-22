import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int num = 0;

        for(int i=0; i<a.length(); i++) {

            char ch = a.charAt(i);

            if (ch == 'c'){
                if(i < a.length()-1) {
                    if (a.charAt(i + 1) == '=' || a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if(ch == 'd'){
                if(i < a.length()-1) {
                    if(a.charAt(i + 1) == 'z') {
                        if(i < a.length()-2) {
                            if (a.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (a.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'l') {
                if(i < a.length()-1) {
                    if (a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 'n') {
                if(i < a.length()-1) {
                    if (a.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 's') {
                if(i < a.length()-1) {
                    if (a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (ch == 'z') {
                if(i < a.length()-1) {
                    if (a.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            num++;
        }

        System.out.print(num);
    }
}
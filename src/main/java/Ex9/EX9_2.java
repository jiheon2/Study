package Ex9;

import java.util.Scanner;

public class EX9_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.printf("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.printf("출력 문자열 ==> ");
        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == 'o') {
                System.out.printf("%c", '$');;
            } else {
                System.out.printf("%c", str.charAt(i));
            }
        }
    }
}

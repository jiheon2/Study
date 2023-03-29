package PT;

import java.util.Scanner;

public class PT2 {
    public static void main(String[] args) {
        int a, b, c, d;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
            a = s.nextInt();
        System.out.printf("<1> 덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==> ");
                b = s.nextInt();
        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
                c = s.nextInt();
        if(b==1) {
            System.out.printf("%d + %d = %d", a, c, result = a + c);
        } else if(b==2) {
            System.out.printf("%d - %d = %d", a, c, result = a - c);
        } else if(b==3) {
            System.out.printf("%d * %d = %d", a, c, result = a * c);
        } else if(b==4) {
            System.out.printf("%d / %d = %d", a, c, result = a / c);
        }
        else {
            System.out.printf("유효하지 않은 값 입니다");
        }
    }
}

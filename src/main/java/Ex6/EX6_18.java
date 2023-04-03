package Ex6;

import java.util.Scanner;

public class EX6_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        for( ; ; )
        System.out.printf("더할 첫 번째 수 입력 : ");
        a = s.nextInt();
        System.out.printf("더할 두 번째 수 입력 : ");
        b = s.nextInt();
        System.out.printf("%d + %d = %d \n", a, b, a + b);

    }
}
//12행 unreachable statement 오류
//무한루프를 만들면 생기는 오류
//무한루프를 만드는 조건은 for( ; ; )
package Ex6;

import java.util.Scanner;

public class EX6_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c, i;
        int hap = 0;

        System.out.printf("시작값 입력 : ");
        a = s.nextInt();
        System.out.printf("끝값 입력 : ");
        b = s.nextInt();
        System.out.printf("증가값 입력 : ");
        c = s.nextInt();

        for(i=a; i<=b; i+=3) {
            hap = hap+i;
        }
        System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d \n", a, b, c, hap);
    }
}
//값이 맞질 않음
//for문 조건식이 잘못됨 : i=0이 아니라 i=a였음
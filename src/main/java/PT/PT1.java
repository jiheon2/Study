package PT;

import java.util.Scanner;

public class PT1 {

    public static void main(String[] args) {
        int a, b, c, d;
        int result;
        Scanner s = new Scanner(System.in);
//               java: ';' expected 마지막에 세미콜론을 안달았다.
        System.out.printf("첫번째 계산할 값을 입력하세요 == >  ");
                a = s.nextInt();

        System.out.printf("두번째 계산할 값을 입력하세요 == >  ");
                b = s.nextInt();

        System.out.printf("세번째 계산할 값을 입력하세요 == >  ");
                c = s.nextInt();

        System.out.printf("네번째 계산할 값을 입력하세요 == >  ");
//        %d를 넣는게 아니다 > 빈칸으로 남겨둬야 함
                d = s.nextInt();
//                int d = s.nextInt(); 가 아니다 > int 를 두번 선언해서 오류 발생
// a, b, c의 값이 선언되지 않았다 > 넥스트인트 한번에 선언 x




        System.out.printf("%d+%d+%d+%d = %d \n", a, b, c, d, result = a+b+c+d);
//        결과값이 안나타났다 마지막 %d에 들어갈 값이 없다 > result 변수 선언후 수식 대입
    }
}

package Ex7;

import java.util.Scanner;

public class EX7_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        while(true) {
            System.out.printf("더할 첫 번째 수 입력 : ");
            a = s.nextInt();
            System.out.printf("더할 두 번째 수 입력 : ");
            b = s.nextInt();

            if (a == 0 && b == 0)
                break;
            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
        System.out.printf("0을 입력해서 반복문을 탈출했습니다.\n");
    }
}
//break outside switch or loop : 스위치문이나 루프 바깥에 선언해야한다고 오류가 뜸 어디다가 해야할까
//1번쨰 실행 원하는 값 안나옴
//2번쨰 실행 원하는 값 안나옴 break의 위치를 if문 바로 밑에서 출력문 밑으로 옮김
//3번째 실행 원하는 값 안나옴 for문으로는 못하는것 같아서 while문 사용해 무한루프 만들기
//4번째 실행 원하는 값 나옴 >> while(true)선언 답지를 보고 작성 for문으로는 못만드는걸까
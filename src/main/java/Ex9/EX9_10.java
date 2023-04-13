package Ex9;

import java.util.Scanner;

public class EX9_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner 클래스를 인스턴트화하여 s로 만듬
        int coffee;

        System.out.printf("어떤 커피를 드릴까요? (1:보통 2:설탕 3:블랙) ");
        coffee = s.nextInt(); // Scanner클래스의 함수 nextInt()를 s를 통해 사용

        System.out.printf("\n#1. 뜨거운 물을 준비한다\n");
        System.out.printf("#2. 종이컵을 준비한다\n");

        switch(coffee) { // 변수 coffee가 1, 2, 3, 나머지일 경우 각각 배정된 출력문을 출력함
            case 1:
                System.out.printf("#3. 보통 커피를 탄다\n"); break;
            case 2:
                System.out.printf("#3. 설탕 커피를 탄다\n"); break;
            case 3:
                System.out.printf("#3. 블랙 커피를 탄다\n"); break;
            default:
                System.out.printf("#3. 아무거나 탄다\n"); break;
        }
        System.out.printf("#4. 물을 붓는다\n");
        System.out.printf("#5. 스푼으로 저어서 녹인다\n\n");

        System.out.printf("손님~ 커피 여기 있습니다.\n");
    }

}

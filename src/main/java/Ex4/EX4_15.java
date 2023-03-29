package Ex4;

public class EX4_15 {
    public static void main(String[] args) {
        int a = 100, result;
//        a = 100이라고 선언했으나 result를 선언하지 않음
        int i;
//        for문을 사용해야하는 지 모르고 i를 선언하지 않음
        for (i = 1; i < 6; i++) {
            System.out.printf("%d << %d = %d \n", a, i, result=a << i);
        }

        for (i = 1; i < 6; i++) {
            System.out.printf("%d >> %d = %d \n", a, i, result=a >> i);
        }
    }
}
// variable result might not have been initialized error : result = 값을 선언 하지 않아서 생긴 오류

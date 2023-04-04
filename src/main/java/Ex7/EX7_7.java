package Ex7;

public class EX7_7 {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++) {
            System.out.printf("for문을  %d회 실행했습니다.\n",i);
            break;
        }

        System.out.printf("for문을 종료했습니다.\n");
    }
}
// break 걸면 그 즉시 함수가 종료되고 다음으로 넘어간다
package Ex6;

public class EX6_7 {
    public static void main(String[] args) {
        int i;
        int hap = 0;

        for(i=0; i<11; i++) {
            hap += i;
//            hap += i == hap = hap + 1 자유자재로 변환이 가능해야 한다 외우자
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}

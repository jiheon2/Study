package Ex6;

public class EX6_7A {
    public static void main(String[] args) {
        int i;
        int hap = 0;

        for(i=1; i<12346; i++) {
            hap += i;
        }
        System.out.printf("1에서 12345까지의 합 : %d \n", hap);
    }
}
// for문 조건식의 범위 유의하기 / hap 변수 선언 유의하기
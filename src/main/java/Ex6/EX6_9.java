package Ex6;

public class EX6_9 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i=501; i<1000; i+=2) {
            hap += i;
        }
        System.out.printf("500부터 1000까지의 홀수의 합을 구하시오 : %d \n", hap);
    }
}
// for문이든 if문이던 조건 뒤에 ; 쓰지 않기
// 증감연산자, 대입연산자 외우기
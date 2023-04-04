package Ex7;

public class EX7_11 {
    public static void main(String[] args) {
        int hap = 0;
        //hap이라는 변수를 메모리에 선언 0이라는 값
        int i;

        for(;;) { //무한반복
            for(i=1; i<=100; i++) { //for 100번 반복
                hap += i; //증가되는 i의 값을 모두 더한것을 hap에 저장
                if(hap>2000) { // hap이 2000을 넘길 경우
                System.out.printf("%d\n", hap);
                    hap=0; //hap을 0으로 초기화 변수의 값이 없을땐 저장 값이 있을떈 초기화
                    break; // if문을 벗어남
                }
            }
            System.out.printf("아직도 반복중...\n");
        }

    }
}
//break는 if를 빠져나가는 용도로 사용되었다 그래서 두번째 for문이 계속 반복되는 것(hap=0이기 때문에)
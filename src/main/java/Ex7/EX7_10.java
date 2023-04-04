package Ex7;

public class EX7_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i=1; i<=100; i++) {
            if(i%3==0)
                continue;
            hap += i;
        }

        System.out.printf("1~100까지의 합(3의 배수 제외): %d\n", hap);
    }
}
//작동원리 > cotinue이하에 있는 구문은 실행되지 않음 if문의 조건이 3의 배수를 나타내기에 3의 배수가 나타났을때 hap+=i를 적용하지 않고 위의
//조건절을 거치고 증감연산자가 적용된다.
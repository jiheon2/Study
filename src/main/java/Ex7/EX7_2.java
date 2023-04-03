package Ex7;

public class EX7_2 {
    public static void main(String[] args) {
        int i;
        i=1;
        int hap = 0;
        while(i<11) {
            hap += i;
            i++;
        }
        System.out.printf("1에서 10까지의 합: %d \n", hap);
    }
}
//1차실행 오류 %d에 들어갈 변수를 작성하지않음
//2차실행 while문 안에 printf를 사용해 10번이나 나옴 1번만 나오게 하려면 밖으로 빼야함
//3차실행 clear
package Ex7;

public class EX7_5 {
    public static void main(String[] args) {
        int a = 100;

        while(a==200) {
            System.out.printf("while 문 내부에 들어 왔습니다.\n");
        }
        do {
            System.out.printf("do~while 문 내부에 들어 왔습니다.\n");
        }while(a==200);
    }
}
//while문과 do while의 차이 : do while의 조건식은 아래쪽에 있음
//while문은 조건식이 거짓일 때 문장을 한번도 수행하지 않음
//do while은 참 거짓 상관없이 do에 쓰여진 문장은 무조건 한번은 수행됨
package PT;

import java.util.Scanner;
public class PT3 {
    public static void main(String[] args) {
        int a, b;
        String c;
        int result;

        Scanner s = new Scanner(System.in);
//        문자열을 입력받는 함수는 무엇일까
        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = s.nextInt();
        System.out.printf("+ - * / %% ==> ");
        c = s.next();
        System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
        b = s.nextInt();
//        if 문이 출력되지 않음 이유를 모르겠음
        if (c.equals("+")) {
            result = a + b;
            System.out.printf("%d + %d = %d", a, b, result);
        } else if (c.equals("-")) {
            result = a - b;
            System.out.printf("%d - %d = %d", a, b, result);
        } else if (c == "*") {
            result = a * b;
            System.out.printf("%d * %d = %d", a, b, result);
        } else if(c == "%") {
            if(b!=0) {
                result = a % b;
                System.out.printf("%d %% %d = %d", a, b, result);
            } else {
                System.out.printf("0으로 나누면 나머지 값이 안됩니다");
            }
        } else if(c == "/") {
             if(b!=0) {
                 result = a / b;
            System.out.printf("%d / %d = %d", a, b, result);
        } else {
                 System.out.printf("0으로 나누면 안됩니다");
             }
        }
    }
}
// 코드를 다 못적음
// 막히는 부분 1. 문자c를 입력받게하는 함수?? > (char) System.in.read(); c = next();
// 2. if조건절에 문자를 포함하는 방법?? > ' '
// 3. 입력 예외 처리를 위한 클래스를 임포트해라 >> import java.io.IOException; 그리고 psvm 뒤에 throws IOException을 입력
// 4. String을 사용해서 문자열을 대입해야 함 > Scanner를 사용하고 변수를 String으로 선언 후 값에 " " 을 대입 ex) String c = "";
// 5. if 문에 /를 쓸때 두가지 경우로 나누어야함 >
// 6. scanner s로 문자열이 입력이 안된다... > nextline이 아니라 그냥 next였다 이둘의 차이는?
// 7. if 문이 작동을 하지 않는다 이유는? > 문자열을 표시하는 두번째 프린트아웃이 잘못되었음 %% 안씀
// 8. %를 표시할때 printf에 사용할경우 %%로 표시해야 한다
// 9. System.out.pintf안에는 값을 선언할 수 없다 ex) result = a + b X
// 10. c. equals("+")로 표시하니 결과가 나왔다
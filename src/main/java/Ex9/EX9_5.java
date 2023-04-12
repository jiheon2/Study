package Ex9;

import java.util.Scanner;

public class EX9_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 문자열을 입력받기 위해서 스캐너 선언
        String str, strRep, strSub, strAry[]; // String 참조변수 4가지 선언

        System.out.printf("문자열을 입력하세요 : ");
        str = s.nextLine(); //문자열을 입력받기 위해 nextLine 사용 / s.nextLine()에서 만든 인스턴스(입력받은 값)을 str이 가르킴
        //Scanner라는 클래스를 s로 인스턴트화(객체화)하였고 함수 nextLine을 사용
        strRep = str.replace(" ", "$"); //String클래스를 str로 인스턴트화 하고 String의 함수 replace를 사용
        // replace 함수는 target값을 replacement로 치환
        strSub = str.substring(3, 8); // String클래스의 함수 substring을 인스턴트화 한 str을 통해 사용
        // substring 함수는 첫번째값(3)부터 끝값(8)까지 잘라주는 함수
        strAry = str.split(" "); // String클래스의 함수 split을 str을 통해 사용
        // split 함수는 지정된 구분값(ex , . / etc..)(" "공백)을 기준으로 나누어 배열에 넣어주는 기능

        System.out.println("입력 문자열 ==>" + str);
        System.out.println("바꾼 문자열 ==>" + strRep);
        System.out.println("일부 문자열 ==>" + strSub);
        for(int i=0; i<strAry.length; i++) { // i가 0부터 시작, i가 배열 strAry의 길이보다 작을 때, i++
            System.out.println("분리한 문자열"+ i +"==>" + strAry[i]);
        }
    }
}

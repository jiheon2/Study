package Ex9;

public class EX9_9 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");
        // String 데이터형식은 new를 사용해서 선언가능하다

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");
        System.out.println("원 문자열3 ==> [" + str3 + "]\n");

        System.out.println("문자열1 == 문자열2 결과 : \t" + (str1 == str2));
        System.out.println("문자열1 .equals(문자열2) 결과 : " + str1.equals(str2));
        System.out.println("문자열1 == 문자열3 결과 : \t" + (str1 == str3));
        // str1과 str2가 똑같지만 str3와는 다른 이유는 str1과 str2는 메모리에 같은 주소 값에 저장된 값을 가져왔기 때문에
        // == 연산자를 사용해도 같다고 표시가 뜨는 것(같은 데이터 하나를 str1과 str2가 공유하는 것)
        // 하지만 new를 사용해 생성한 str3는 주소값이 str1과 str2와 다르기 때문에 결과가 false로 나타나는 것이다
        System.out.println("문자열1 .equals(문자열3) 결과 : " + str1.equals(str3));
        // ==와 .equals함수는 두 문자열이 같은지 확인할 때 사용하는 것 / 같으면 true값 다르면 false값을 return한다
        // ==은 데이터 값과 저장된 위치(주소 값)이 같아야만 true / .equals는 데이터 값(문자열의 내용)만 같으면 true
    }
}

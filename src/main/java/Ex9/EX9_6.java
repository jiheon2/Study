package Ex9;

public class EX9_6 {
    public static void main(String[] args) {
        String str = "  한글  ABCD    efgh    "; //String 클래스를 인스턴트화한것이 str

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        // toUpperCase 함수는 소문자를 대문자로 변경하는 함수
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        // toLowerCase 함수는 대문자를 소문자로 변경하는 함수
        System.out.println("공백제거 ==> [" + str.trim() + "]");
        // trim 함수는 문자열의 앞과 끝의 공백을 제거해주는 함수(중간은 제거할 수 없음)
    }
}

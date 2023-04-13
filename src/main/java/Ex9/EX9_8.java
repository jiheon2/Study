package Ex9;

public class EX9_8 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2));
        // compareTo 함수는 두 문자열을 비교하는 함수이다 str1과 str2를 비교했음
        System.out.println(str1.contains("Java"));
        // contains 함수는 문자열이 포함되어 있는지 확인하는 함수이다 Java가 포함되어있는지 확인
    }
}

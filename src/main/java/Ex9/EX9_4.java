package Ex9;

public class EX9_4 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.printf("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java")); //String 클래스를 str로 인스턴트화 후 indexOf 함수를 사용
        // indexOf는 특정 문자나 특정 문자열이 처음으로 나타나는 인덱스(숫자)를 반환하는 함수 / 없을 경우 -1 반환
        System.out.printf("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));
        // lastIndexOf는 특정 문자나 특정 문자열이 마지막으로 나타나는 인덱스(숫자)를 반환하는 함수 / 없을 경우 -1 반환
    }
}

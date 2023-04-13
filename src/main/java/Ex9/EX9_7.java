package Ex9;

public class EX9_7 {
    public static void main(String[] args) {
        String str = "  한글  ABCD    efgh    "; // String 클래스를 str로 인스턴트화`
        String result = ""; // 결과를 저장할 문자열 변수 result

        for(int i=0; i<str.length(); i++) { //i가 문자열(str)의 길이보다 작다면
            if(str.charAt(i) != ' ') {
            result += str.substring(i, i+1);
            }
        }

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("공백제거 ==> [" + result + "]");
    }
}

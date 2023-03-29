package Ex5;

public class EX5_7 {
    public static void main(String[] args) {
        int a = 75;

        if(a>50) {
            if (a < 100) {
                System.out.printf("50보다 크고 100보다 작군요..");
            } else {
                System.out.printf("100보다 크군요..");
            }
        } else {
                System.out.printf("50보다 작군요..");
            }
        }
    }
// else 의 조건이 성립되지 않았다 이유는? > else의 조건을 입력하지 않아도 됬었다. else의 개념을 다시 잡자
// if 하나에 else 하나는 묶음 if{ if { } else { } } else { } 기억하자
// 괄호의 갯수를 항상 체크하기
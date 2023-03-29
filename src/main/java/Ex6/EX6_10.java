package Ex6;

import java.util.Scanner;

public class EX6_10 {
    public static void main(String[] args) {
        int i, a;
        int hap = 0;
        Scanner s = new Scanner(System.in);

        System.out.printf("값 입력 : ");
        a = s.nextInt();

        for(i=1; i<a+1; i++) {
            hap += i;
        }
        System.out.printf("1에서 100까지의 합 : %d \n", hap);
    }
}

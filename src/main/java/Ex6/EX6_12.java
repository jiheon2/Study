package Ex6;

import java.util.Scanner;

public class EX6_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, k;

        System.out.printf("몇 단? : ");
        k = s.nextInt();

        for (i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d \n", k, i, k * i);
        }
    }
}

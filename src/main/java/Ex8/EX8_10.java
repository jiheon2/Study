package Ex8;

import java.util.Scanner;

public class EX8_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, col;

        System.out.printf("행의 개수를 입력 : ");
        row = s.nextInt();
        System.out.printf("열의 개수를 입력 : ");
        col = s.nextInt();

        int[][] aa = new int[row][col];

        int i, k;
        int val = 1;
        for(i=0; i<row; i++) {
            for(k=0; k<col; k++) {
                aa[i][k] = val;
                val++;
            }
        }
        System.out.printf("aa[0][0]부터 aa[%d][%d]까지 출력\n", row, col);

        for(i=0; i<row; i++) {
            for(k=0; k<col; k++) {
                System.out.printf("%3d", aa[i][k]);
            }
            System.out.printf("\n");
        }
    }
}

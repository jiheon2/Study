package Ex5;

import java.util.Scanner;

public class EX5_8A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if(a>=95) {
            System.out.printf("A+");
        } else if(a>=90) {
            System.out.printf("A");
        } else if(a>=85) {
            System.out.printf("B+");
        } else if(a>=80) {
            System.out.printf("B");
        } else if(a>=75) {
            System.out.printf("C+");
        } else if(a>=70) {
            System.out.printf("C");
        } else if(a>=65) {
            System.out.printf("D+");
        } else if(a>=60) {
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }
    }
}

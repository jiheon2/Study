package Ex4;

public class EX4_14 {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("%d 를 오른쪽 1회 시프트하면 %d 이다. \n",a, a>>1);
        System.out.printf("%d 를 오른쪽 2회 시프트하면 %d 이다. \n",a, a>>2);
        System.out.printf("%d 를 오른쪽 3회 시프트하면 %d 이다. \n",a, a>>3);
        System.out.printf("%d 를 오른쪽 4회 시프트하면 %d 이다. \n",a, a>>4);
    }
}
// 오른쪽으로 1 시프트를 하면 2의 1제곱으로 나눈다.
// 오른쪽으로 2 시프트를 하면 2의 2제곱으로 나눈다.
package Ex4;

public class EX4_16A {
    public static void main(String[] args) {
        int a = 3, result;
        int i;

        for(i=1; i<11; i++) {
            System.out.printf("%d << %d = %d \n", a, i, result = a<<i);
        }
    }
}

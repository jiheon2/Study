package Ex6;

public class EX6_15 {
    public static void main(String[] args) {
        int i, k;
        for(i=2; i<=9; i++) {
            for(k=1; k<=9; k++) {
                System.out.printf("%2d x %d = %2d", i, k, i*k);
            }
            System.out.printf("\n");
        }
    }
}

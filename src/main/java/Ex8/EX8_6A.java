package Ex8;

public class EX8_6A {
    public static void main(String[] args) {
        int aa[]={10,20,30,40,50};
        int count = aa.length;
        int hap = 0;

        for (int i=0; i<count; i++) {
             hap += aa[i];
        }
        System.out.printf("배열 값들의 합은 %d", hap);
    }
}

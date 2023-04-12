package Ex8;

public class EX8_11A {
    public static void main(String[] args) {
            char[] stack = new char[5];
            int top = 0;

            if(top>=5) {
                System.out.printf("터널이 꽉 차서 차가 못들어감 \n");
            } else {
                stack[top] = 'A';
                System.out.printf("%c 자동차가 터널에 들어감 \n", stack[top]);
                top++;
            }

        if(top>=5) {
            System.out.printf("터널이 꽉 차서 차가 못들어감 \n");
        } else {
            stack[top] = 'B';
            System.out.printf("%c 자동차가 터널에 들어감 \n", stack[top]);
            top++;
        }

        if(top>=5) {
            System.out.printf("터널이 꽉 차서 차가 못들어감 \n");
        } else {
            stack[top] = 'C';
            System.out.printf("%c 자동차가 터널에 들어감 \n", stack[top]);
            top++;
        }

            System.out.printf("\n");


        if(top<=0) {
            System.out.printf("현재 터널에 자동차가 없음\n");
        } else {
            top--;
            System.out.printf("%c 자동차가 터널에 빠져나감 \n", stack[top]);
            stack[top] = ' ';
        }
        if(top<=0) {
            System.out.printf("현재 터널에 자동차가 없음\n");
        } else {
            top--;
            System.out.printf("%c 자동차가 터널에 빠져나감 \n", stack[top]);
            stack[top] = ' ';
        }

        if(top<=0) {
            System.out.printf("현재 터널에 자동차가 없음\n");
        } else {
            top--;
            System.out.printf("%c 자동차가 터널에 빠져나감 \n", stack[top]);
            stack[top] = ' ';
        }
    }
}

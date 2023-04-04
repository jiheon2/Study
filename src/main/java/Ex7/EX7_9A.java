package Ex7;

public class EX7_9A { public static void main(String[] args) {
    int hap = 0;
    int i=1;

    while(i<=100) {
        hap += i;

        if(hap>=1000)
            break;
            i++;
    }
    System.out.printf("1-100까지의 합에서 최초로 1000이 넘는 위치는? : %d \n", i);
    }
}

//값이 46이 나왔다 이유가 뭘까
//i++를 if밑에 넣어야 마지막 한번이 안 더해진다
//while 문 안에 넣으면 i++가 한번더 적용이 되므로 if문 안에 넣어야한다
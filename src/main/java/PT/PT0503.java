package PT;

public class PT0503 {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        System.out.println(log.substring(0,15));
        String in[] = log.split(" ");
        System.out.println(in[0]);
        System.out.println(in[3] + " " + in[4]);
        String time;
        time = in[3].replace("[", "");
        System.out.println(time);
    }
}

// 회문수(거꾸로 읽어도 앞으로 읽는 것과 같은 수)를 구하는 프로그램

public class Exercise4_15 {
    public static void main(String[] args) {

        int num = 12321;
        // num과 같은 값으로 반복문에 사용할 변수 tmp 선언
        int tmp = num;

        // 변수 num를 거꾸로 변환해서 담을 변수
        int result = 0;

        /*
        / 연산을 활용해 tmp의 1의 자리수부터 삭제해가며
        result에 tmp의 1의 자리수부터 대입하는 반복문
         */
        while (tmp != 0) {
            result = result*10 + tmp%10;
            tmp = tmp/10;
        }

        if (result == num)
            System.out.println(num + "는 회문수 입니다.");
        else
            System.out.println(num + "는 회문수가 아닙니다.");
    }
}

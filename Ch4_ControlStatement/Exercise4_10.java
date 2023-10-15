// int 타입의 변수의 각 자리수를 더한 결과를 출력하는 코드
// % 연산 활용

public class Exercise4_10 {
    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;

        while (num > 0) {
            // 1의 자리 부터 더함
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

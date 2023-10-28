// 메소드명: abs
// 기   능: 주어진 값의 절대값을 반환한다.
// 반환타입: int
// 매개변수: int value
public class Exercise6_24 {
    // int abs(int value): int 타입을 매개변수로 받고, int 타입을 반환한다.
    public static int abs(int value) {
        // 삼항연산자를 활용해 기능 정의
        return (value >= 0 ? value : -value);
    }

    public static void main(String[] args) {
        int value = 5;
        int value2 = -10;
        String value3 = "오류";

        // abs() 호출
        System.out.println(abs(value)); // 5
        System.out.println(abs(value2)); // 10
        System.out.println(abs(value3)); // 오류: String 타입은 매개변수로 받을 수 없음
    }
}

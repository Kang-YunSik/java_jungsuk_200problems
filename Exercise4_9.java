package net.hw.javajungsuk.Exercise4;

// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
// String클래스의 charAt(int i) 활용

public class Exercise4_9 {
    public static void main(String[] args) {

        String str = "12345";
        int sum = 0;
        System.out.println(str.length());

        // str.length() : str 변수의 문자열 길이
        // 문자열의 번호는 0부터 시작으로 i=5가 되면 str.charAt(i)에서 오류가 발생 -> 읽을 수 있는 문자가 없음
        for (int i=0; i<str.length(); i++){
            // charAt(int i) : 문자열 i번째를 char 타입으로 변환. 단, ASCII코드 값으로 변환된다.
            // ASCII 코드에서 '0' = 48 의 값을 갖는다.
            sum += str.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}

package net.hw.javajungsuk;

// 문자형 변수 ch가 영문자이거나 숫자일 때만 변수 b가 true가 되도록 하는 코드
// 논리 연산자와 비교 연산자

public class Exercise3_9 {
    public static void main(String[] args) {
        // 문자 데이터는 '' 기호로 선언한다.
        char ch = 'z';

        // boolean 타입은 true 또는 false
        // 논리 연산자: &&(모두 참일 때 참), ||(하나만 참이어도 참), !(부정)
        // 비교 연산자: <=, >=, ==

        // 문자 데이터는 ASCII 코드로 이루어져있고, 숫자는 0~9까지있다.
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');

        System.out.println(b);
    }
}

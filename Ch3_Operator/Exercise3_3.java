package net.hw.javajungsuk;

// num의 값에 따라 '양수','음수','0'을 출력하는 코드
// 삼항연산자 활용

public class Exercise3_3 {
    public static void main(String[] args) {

        int num = 10;
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0")); // 삼항연산자 삼항연사자를 삽입할 수 있음.
                                                                        // 결국, if else-if else 의 구조가 된다.
    }
}

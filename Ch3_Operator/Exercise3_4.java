package net.hw.javajungsuk;

// int형의 나눗셈 연산

public class Exercise3_4 {
    public static void main(String[] args) {

        // num의 값 중에서 백의 자리 이하는 버리는 코드
        int num1 = 456;
        System.out.println(num1/100*100); // int형에서 나눗셈 연산의 특징(소수점을 표현 못함)을 활용한 정답1
        System.out.println(num1-num1%100); // 나머지 연산(%)을 활용한 정답2

        // num의 값 중에서 일의 자리를 1로 바꾸는 코드
        // num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
        int num2 = 333;
        System.out.println(num2/10*10+1); // int형에서 나눗셈 연산의 특징(소수점을 표현 못함)을 활용한 정답1
        System.out.println(num2-num2%110+1); // 나머지 연산(%)을 활용한 정답2

    }
}

package net.hw.javajungsuk;

// int의 나눗셈 연산과 삼항 연산자
// 사과를 담는데 필요한 바구니 개수를 구하는 코드

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        // int형 변수 초기값 선언
        int numOfApples = 123;
        int sizeOfBucket = 10;

        // 바구니 개수를 구하는 로직
        int numOfBucket = numOfApples/sizeOfBucket // int형 변수이므로 소수점 이하 자리수는 생략된다
                          + (numOfApples%sizeOfBucket > 0 ? 1 : 0); // 삼항 연산자를 활용해 소수점 이하의 값이 있을 때 바구니 1개를 더해줌

        System.out.println("필요한 바구니의 수: "+numOfBucket);
    }
}
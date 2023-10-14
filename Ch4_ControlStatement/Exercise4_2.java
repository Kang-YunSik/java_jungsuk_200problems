package net.hw.javajungsuk.Exercise4;

// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

public class Exercise4_2 {
    public static void main(String[] args) {

        int sum=0;

        for(int i=1 ; i<20 ; i++){
            // 나머지 연산자와 논리 연산자로 알고리즘 구현
            if (i%2 != 0 && i%3 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

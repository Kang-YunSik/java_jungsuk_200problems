package net.hw.javajungsuk.Exercise4;

// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

public class Exercise4_3 {
    public static void main(String[] args) {

        // 내 방식
        int sum1 = 0;

        for(int i=10; i>0; i--){
            for(int j=1; j<=i; j++){
                sum1 += j;
            }
        }
        System.out.println(sum1);

        // 답지
        int sum2 = 0;
        int totalSum = 0;

        for(int i=1; i <=10; i++) {
            sum2 += i;
            totalSum += sum2;
        }
        System.out.println("totalSum="+totalSum);
    }
}

package net.hw.javajungsuk.Exercise4;

// for문을 while문으로 변경하시오.

public class Exercise4_5 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        int i = 0;

        while (i<=10){
            // 변수 j=0 으로 초기화
            int j = 0;
            while (j<=i){
                System.out.print("*");
                // 모든 수행이 끝난 뒤 j 증감
                j++;
            }
            System.out.println();
            // 모든 수행이 끝난 뒤 i 증감
            i++;
        }
    }
}

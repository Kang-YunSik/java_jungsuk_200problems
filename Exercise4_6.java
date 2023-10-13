package net.hw.javajungsuk.Exercise4;

// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.

public class Exercise4_6 {
    public static void main(String[] args) {
        // 코드 로직
        // i가 1일 때, j는 1~6까지 iter. 도중 i+j=6 일 때, 출력
        // i가 2일 때, j는 1~6까지 iter
        
        // 변수 i : 첫 번째 주사위
        for (int i = 1; i <= 6; i++)
            // 변수 j : 두 번 째 주사위
            for (int j = 1; j <= 6; j++)
                // 두 주사위의 합이 6이될 때 출력
                if (i + j == 6)
                    System.out.println(i + "+" + j + "=" + (i + j));
    }
}

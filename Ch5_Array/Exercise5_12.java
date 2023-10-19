// String 타입의 퀴즈 맞추기 프로그램

import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {

        // words 2차원 배열 정의.
        // words 배열은 정답지
        String [][] words = {
                {"chair","의자"},
                {"computer","컴퓨터"},
                {"integer","정수"}
        };

        // 몇 문제 맞췄는지 출력해주기 위한 변수 score 초기화
        int score = 0;

        // scanner 객체 생성.
        // 파라미터 = 시스템 입력 값
        Scanner scanner = new Scanner(System.in);

        /* 퀴즈를 맞췄는지 확인하는 반복문
        [sudo]
        1. "Q[i+1]. words[i][0]의 뜻은?" 의 형태로 문제 출력
        2. tmp 변수에 시스템 입력에서 입력한 값 + Enter 를 대입
        3. tmp와 words[i][1]을 비교하여 조건문 수행
        3-1. 값이 같으면, "정답입니다" 출력 + score 1증가
        3-2. 값이 다르면, "틀렸습니다. 정답은 words[i][1]입니다." 출력
        */
        for (int i=0; i< words.length;i++){

            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            // tmp 변수에 시스템 입력에서 입력한 값 + Enter 를 대입
            String tmp = scanner.nextLine();

            // String의 값을 비교하기 위해 equals() 메소드 사용
            if (tmp.equals(words[i][1])){
                System.out.printf("정답입니다.\n\n");
                score++;
            }else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n",words[i][1]);
            }
        }

        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.\n", words.length, score);
    }
}

public class Exercise5_11 {
    public static void main(String[] args) {

        // score 2차원 배열 정의
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        
        // result 2차원 빈 배열 선언. score보다 행과 열이 1씩 더 큰 배열
        int[][] result = new int[score.length+1][score[0].length+1];


        /* 각 행과 열의 총합을 구하고 배열에 대입하는 반복문
        [sudo]
        1. score 배열에 0행부터 0열 1열 2열 3열의 값을 result 배열에 대입 (기존 배열 값 대입)
        2. result 배열 0행의 마지막 열에 result 0행 0열,1열,2열,3열의 값을 모두 더한 값을 대입
        3. result 배열 마지막 행의 마지막 열에 result 0열 0행,1행,2행,3행,4행의 값을 모두 더한 값을 대입
        4. result[마지막 행,마지막 열]에 모든 합을 더한 값 대입
        */
        for (int i=0; i<score.length;i++){
            for (int j=0; j<score[i].length;j++){
                // 기존 배열 값 대입
                result[i][j] = score[i][j];
                // result 마지막 행과 열에 각 행과 열을 더합 값 대입
                result[i][score[0].length] += result[i][j];
                result[score.length][j] += result[i][j];
                // result[마지막 행,마지막 열]에 모든 합을 더한 값 대입
                result[score.length][score[0].length] += result[i][j];
            }
        }

        // result 배열 출력.
        // 출력서식을 활용해 자릿수 맞춤
        for (int i=0; i< result.length; i++){
            for (int j=0; j<result[i].length; j++){
                System.out.printf("%4d", result[i][j]);
            }
            // 한 행이 출력되면 줄바꿈
            System.out.println();
        }
    }
}

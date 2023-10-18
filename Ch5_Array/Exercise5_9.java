// 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램 
public class Exercise5_9 {
    public static void main(String[] args) {
        // 2차원 배열 정의
        // 값끼리 ,로 구분하고 행끼리 {},로 구분한다. 전체{} 마지막에 ;
        char[][] star ={
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        // result 객체 생성[5][4] <-> star 배열[4][5]
        // [star[0].length][star.length] = [star 열의 개수][star 행의 개수]
        // star를 90회전 했을 때, 필요한 배열 크기를 정의함.
        char[][] result = new char[star[0].length][star.length];

        // star 배열을 출력하는 반복문
        // i=행, j=열
        for (int i=0; i<star.length;i++){
            for (int j=0; j< star[i].length; j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        /* star 배열을 90도 회전하는 반복문
        [sudo]
        1. star의 1행 -> result의 3열 
            star의 2행 -> result의 4열
            star의 3행 -> result의 1열
            star의 4행 -> result의 2열
        2. x에 star의 열 데이터를 입력
        3. y에 star의 행 데이터를 입력
        */
        for (int i=0; i< star.length;i++){
            for (int j=0; j< star[i].length;j++){
                int x = j;
                int y = star.length-1-i;

                result[x][y]=star[i][j];
            }
        }

        // result 배열 출력
        for (int i=0; i<result.length;i++){
            for (int j=0; j< result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}

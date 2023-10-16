// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램

public class Exercise5_4 {
    public static void main(String[] args) {

        // 2차원 배열 선언 방법
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float avg = 0;
        System.out.println(arr.length);

        // arr[행][열].length 대괄호를 입력하지 않을 때 행의 갯수를 리턴
        // i행의 j열부터 total에 대입
        // 반복문 : 0행 0열 -> 1열 -> 2열 .. 1행 0열 -> 1열 ... 3행 4열
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                total += arr[i][j];
            }
        }

        avg = total / (float)(arr.length * arr[0].length);
        System.out.println(total);
        System.out.println(avg);

    }
}

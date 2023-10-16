// 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만드는 프로그램

public class Exercise5_5 {
    public static void main(String[] args) {

        /*
        배열 ballArr : 1부터 9까지 숫자를 담는 배열
        배열 ball3 : 3자리 숫자를 담을 (빈)배열 */
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        /*
        아래 반복문은 배열 ballArr의 임의의 요소를 골라서 위치를 바꾸는 로직
        1. j 변수에 0~9까지의 임의의 변수를 대입. (int)(Math.random() * ballArr.length) = 0~9
           ㄴ (0.01~0.99) * 배열 길이 = (0.** ~ 배열길이.**)
           ㄴ int 타입으로 반환하면 (0~배열길이)를 리턴
        2. tmp에 ballArr[i] 데이터를 대입 (출력할 숫자)
        3. ballArr[i]에 ballArr[j=0~9임의숫자] 데이터를 대입
        4. ballArr[j]에 tmp=ballArr[i] 데이터를 대입
            ㄴ 3.과 4. 과정을 통해서 배열을 값을 서로 바꿈
        5. 해당 로직을 9번(ballArr.length) 반복하여 ballArr[i]를 랜덤하게 섞음
        */
        for (int i=0; i<ballArr.length;i++){
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        /*
        arraycopy : [배열1], 데이터 시작 index, [배열2], index 개수
        따라서, 배열 ball3에 ballArr[0~2] 값이 대입된다.
        */
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        // 배열 ball3 출력
        for (int i=0; i<ball3.length; i++){
            System.out.print(ball3[i]);
        }
        System.out.println();
    }
}

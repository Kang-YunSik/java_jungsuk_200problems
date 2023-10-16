// 배열 arr에 담긴 모든 값을 더하는 프로그램

public class Exercise5_3 {
    public static void main(String[] args) {

        /* 배열 선언문 */
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        /* 배열의 index는 0부터 시작한다 */
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println("sum="+sum);
    }
}

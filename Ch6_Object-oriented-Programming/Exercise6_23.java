import java.util.Arrays;

//메서드명:max
//기   능: 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다
//        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//반환타입: int
//매개변수: int[] arr
public class Exercise6_23 {
    public static int max(int[] arr) {
        // 배열 유효성 검사
        if(arr==null || arr.length==0) {
            // max()의 반환값
            return -999999;
        }

        // max 변수를 첫 번째 index로 초기화
        int max = arr[0];

        // arr 1번 째 index 값부터 max랑 비교하는 반복문
        // 기존 max보다 큰 값이라면 max를 교체
        for (int i=1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        // max()의 반환값
        return max;
    }

    public static void main(String[] args) {
        int[] date = {3,2,9,4,7};
        System.out.println(Arrays.toString(date)); // [3,2,9,4,7]
        // max() 호출
        System.out.println("최대값: " + max(date)); // 9
        System.out.println("최대값: " + max(null)); // -999999
        // 크기가 0인 배열
        System.out.println("최대값: " + max(new int[]{})); // -999999
    }

}


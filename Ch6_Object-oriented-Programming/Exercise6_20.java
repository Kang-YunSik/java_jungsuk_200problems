//메서드명 : shuffle
//기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다
//       처리한 배열을 반환한다.
//반환타입 : int[]
//매개변수 : int[] arr => 정수값이 담긴 배열

import java.util.Arrays;

public class Exercise6_20 {
    public static void main(String[] args) {
        // int타입의 original 배열 정의
        int[] original = {1,2,3,4,5,6,7,8,9};
        // original 배열의 내용 출력
        System.out.println(Arrays.toString(original)); // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        // int타입의 result 배열 정의
        // shufflt() 호출
        int[] result = shuffle(original);
        // result 배열 내용 출력
        System.out.println(Arrays.toString(result));

        // shuffle이 static 메소드가 아닐때 original을 매개변수로 받고 싶으면
        // 객체를 생성하고 받아야 한다.
//        Exercise6_20 exercise620 = new Exercise6_20();
//        exercise620.shuffle(original);
    }

    // 반환값으로 int[]를 받고, shuffle 메소드는 int[] arr를 매개변수로 갖는다.
    public static int[] shuffle(int[] arr) { // static 메소드 정의
                                            // original 변수의 주소값이 arr 변수의 주소값과 같아짐.
        // 만약 arr에 내용이 없다면
        if(arr==null || arr.length==0)
            // arr를 반환
            return arr;

        // 배열을 랜덤하게 뒤섞는 반복문
        for(int i=0; i<arr.length;i++){
            // 0~arr.length까지의 랜덤 정수를 j에 대입
            int j = (int)(Math.random()*arr.length);

            // i번째 arr 값을 tmp에 임시 저장
            int tmp = arr[i];
            // j번째 arr 값을 arr i번째에 대입
            arr[i] = arr[j];
            // tmp를 j번째 arr에 대입
            arr[j] = tmp;
        }
        // arr 반환
        return arr;

    }

}

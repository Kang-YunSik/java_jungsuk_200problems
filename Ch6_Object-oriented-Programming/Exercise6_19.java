// garbage collector
public class Exercise6_19 {
    public static void change(String str){
        str += "456"; //
    }

    public static void main(String[] args) {
        String str = "ABC123"; // 참조변수 str 정의
        System.out.println(str); // "ABC123"
        change(str); // change를 호출하면서 문자열 str을 넘겨준다.
                    // change()에 가면 작업 메모리 변경
                    // change()를 수행하고 main()에 오면 작업 재변경
                    // "456" 변수는 제거 -> garbage collector
        System.out.println("After change: " + str); // "ABC123"
    }
}

// 실행 결과를 예측하시오.
// ABC123
// After change: ABC123

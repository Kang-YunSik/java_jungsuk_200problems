import java.util.Scanner;

// 숫자 맞추는 스무고개 게임
// do~while문의 활용.
public class Exercise4_14 {
    public static void main(String[] args) {

        // Math.random() : 0.0 ~ 1.0 까지의 float 타입의 랜덤 수를 리턴
        // +1로 0의 값을 갖지 않도록 함
        int answer = (int) (Math.random()*100)+1;
        int input = 0;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("정답을 입력하세요");
            // nextLine() : 입력한 모든 문자열을 리턴
            // next() : 입력한 문자열 중 공백까지만 리턴
            String sc = scanner.nextLine();
            // Integer.parseInt(String 변수) : String 변수를 int 타입으로 반환
            input = Integer.parseInt(sc);

            if (answer > input){
                System.out.println("정답은 " + input + "보다 큽니다.");
                System.out.println();
            } else if (answer < input) {
                System.out.println("정답은 " + input + "보다 작습니다.");
                System.out.println();
            } else {
                System.out.println("정답입니다. answer= "+answer);
                break;
            }

        }while (true);
    }
}

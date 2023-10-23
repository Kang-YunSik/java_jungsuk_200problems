// SutdaCard클래스에 두 개의 생성자와 info()를 추가해라

public class Exercise6_2 {
    public static void main(String[] args) {
        // card1, card2 객체 생성
        
        // 매개변수가 있는 객체
        SudaCard card1 = new SudaCard(3, false);
        SudaCard card2 = new SudaCard();

        // 매개변수가 없는 객체
        System.out.println(card1.info()); // 3 출력
        System.out.println(card2.info()); // 1K 출력
    }
}

class SudaCard {
    // 필드 선언
    int num;
    boolean isKwang;

    // 클래스 선언
    // 매개변수가 없을 때 필드 값 초기화
    SudaCard(){
        this(1, true);
    }

    // 클래스 선언
    // 매개변수가 있을 때 this 명령어로 필드 값 대입
    SudaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    // 메소드 선언
    // 숫자와 K 또는 공백을 String 으로 리턴
    String info(){
        return num + (isKwang? "K" : "");
    }
}

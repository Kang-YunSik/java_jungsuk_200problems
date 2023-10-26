// 클래스변수(static변수), 인스턴스변수, 지역변수 구분
public class Exercise6_8 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}

class PlayingCard{
    // 인스턴스 변수
    // 선언위치 : 클래스 영역
    // 생성시기 : 인스턴스가 생성되었을 때
    int kind;
    int num;

    // 클래스 변수(static 변수, 공유변수)
    // 선언위치 : 클래스 영역
    // 생성시기 : 클래스가 메모리에 올라갈 때 (객체가 생성되었을 때)
    static int width;
    static int height;

    // 인스턴스 메소드
    PlayingCard(int k, int n){
        // 지역 변수
        // 선언위치 : 블럭 {} 내부
        // 생성시기 : 변수 선언문이 수행되었을 때
        kind = k;
        num = n;
    }
}
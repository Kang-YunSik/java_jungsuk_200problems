//문제 6-6에서 작성한 클래스메서드 getDistance()를
// Mypoint클래스의 인스턴스 메서드로 정의하시오.
public class Exercise6_7 {
    public static void main(String[] args) {
        // 객체 p 정의
        // Mypoint 클래스에서 정의한 인스턴스 변수에 값을 넣어주는 역할을 한다.
        Mypoint p = new Mypoint(1,1);

        // 객체 p에서 getDistance() 메서드 호출(매개변수 x1=2. y1=2)
        System.out.println(p.getDistance(2,2));
    }
}


class Mypoint{
    // 필드 선언 (보라색 변수는 인스턴스 변수이다)
    int x;
    int y;

    // 생성자 함수 정의
    Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 인스턴스 메서드 정의
    // 인스턴스 메서드는 인스턴스 변수 x, y를 사용해서 작업하므로 매개변수로 x1과 y1만 제공받으면 된다.
    // 인스턴스와 관계가 있으므로 static을 사용할 수 없다.
    double getDistance(int x1, int y1){
        // 두 점 사이의 거리를 계산하는 공식
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}
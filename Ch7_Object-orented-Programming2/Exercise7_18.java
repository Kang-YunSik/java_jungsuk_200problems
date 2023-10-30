// 메소드명 : action
// 기   능 : 주어진 객체의 메소드를 호출한다.
//          DanceRobot인 경우, dance()를 호출하고,
//          SingRobot인 경우, sing()을 호출하고,
//          DrawRobot인 경우, draw()를 호출한다.
// 반환타입 : 없음
// 매개변수 : Robot r

// [다형성 개념을 활용한 예정 코드]
// 다형성: 실행 방법은 동일하지만, 실행 결과가 다양하게 나오는 성질
// 다형성은 자동 타입 변환 + 메소드 오버라이딩이 필요하다.
public class Exercise7_18 {

    // action의 매개변수는 Robot타입으로 Robot클래스의 자손클래스인
    // DanceRobot, SingRobot, DrawRobot의 인스턴스는 모두 매개변수로 가능하다.
    public static void action(Robot r) {
        // action 메소드 내에서는 실제로 받아온 인스턴스가 어떤 것인지 알 수 없다.
        // 단지 Robot클래스 또는 그 자손클래스의 인스턴스일 것이라는 것만 알 수 있다.
        // 그래서 instanceof 연산자를 이용해야만 실제 인스턴스의 타입을 확인할 수 있다.
        // instanceof 형태: "객체 instanceof 클래스"
        // instanceof 반환값: true / false
        if (r instanceof DanceRobot) {
            // 참이면, dr
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
        } else if (r instanceof SingRobot) {
            SingRobot sr = (SingRobot) r;
            sr.sing();
        } else if (r instanceof DrawRobot) {
            DrawRobot sr = (DrawRobot) r;
            sr.draw();
        }
    }

    public static void main(String[] args) {
        // Robot 클래스의 객체들을 선언.
        // arr는 Robot의 객체가 아니라, DanceRobot, SingRobot, DrawRobot 클래스의 객체를 저장하는 배열입니다.
        // 이는 Robot 클래스의 하위 클래스인 객체들을 다룰 수 있는 다형성의 예시로 사용된 것이다.
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}

// 객체 생성
class Robot {}

// 춤추는 로봇 객체 생성
class DanceRobot extends Robot {
    // 메소드 오버라이딩
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

// 노래하는 로봇 객체 생성
class SingRobot extends Robot {
    // 메소드 오버라이딩
    void sing() {
        System.out.println("노래을 합니다.");
    }
}

// 그림 그리는 로봇 객체 생성
class DrawRobot extends Robot {
    // 메소드 오버라이딩
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
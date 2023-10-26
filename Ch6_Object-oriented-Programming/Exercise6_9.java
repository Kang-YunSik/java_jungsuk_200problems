// Marine 클래스를 정의하고, 이 클래스의 멤버 중에서 static을 붙여야 하는 것은 어떤 것이고 이유는 무엇인가?
public class Exercise6_9 {
    public static void main(String[] args) {
        // marine1 생성
        Marine marine1 = new Marine();
        System.out.println("병사1의 위치: " + marine1.x + ", " + marine1.y);
        System.out.println("병사1의 체력: " + marine1.hp);
        System.out.println("병사1의 공격력: " + marine1.weapon);
        System.out.println("병사1의 방어력: " + marine1.armor);

        // marine2 생성
        Marine marine2 = new Marine();

        // marine2 이동
        marine2.move(10, 10); // 인스턴스 메서드 호출
        System.out.println("병사2의 위치: " + marine2.x + ", " + marine2.y); // 10, 10
        System.out.println("병사2의 체력: " + marine2.hp); // 60

        // marine2 업그레이드
        marine2.weaponUp(); // static 메서드여도 호출 가능
        marine2.armorUp(); // static 메서드여도 호출 가능
        System.out.println("병사2의 공격력: " + marine2.weapon); // 7
        System.out.println("병사2의 방어력: " + marine2.armor); // 1
    }
}

class Marine{
    // 인스턴스 변수
    // 각각의 Marine의 개별적인 값 (변수)
    int x=0, y=0; // Marine의 위치 좌표
    int hp=60; // Marine의 현재 체력

    // static 변수
    // 모든 Marine이 동일하게 갖는 값 (상수)
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력

    // static 메서드 선언
    // weapon은 static 변수이므로 메서드도 static으로 선언하다.
    static void weaponUp(){
        weapon++;
    }
    static void armorUp(){
        armor++;
    }

    // x, y는 인스턴스 변수이므로 메서드도 인스턴스로 선언한다.
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}
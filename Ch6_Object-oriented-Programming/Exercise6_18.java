// 인스턴스, static 변수와 메서드의 사용범위
public class Exercise6_18 {
    // 인스턴스 변수
    int iv = 10;
    // static 변수
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = iv; // 컴파일에러: static 변수의 초기화에는 인스턴스 변수를 사용할 수 없다.

    // static 메서드: static 변수만 사용
    static void staticMethod1(){
        System.out.println(cv);
        System.out.println(iv); //컴파일에러: static 메서드에서는 인스턴스 변수를 사용할 수 없다.
    }

    // 인스턴스 메서드: 인스턴스, static 변수 모두 사용 가능
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }
    
    // static 메서드: static 메서드만 사용
    static void staticMethod2(){
        staticMethod1();
        instanceMethod1(); // 컴파일에러: static 메서드에서는 인스턴스 메서드를 호출할 수 없다.
    }

    // 인스턴스 메서드2: 인스턴스, static 메서드 모두 호출 가능
    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}

// 결과를 예상하시오.
public class Exercise7_20 {
    public static void main(String[] args) {
        // Parent2 클래스에서 객체 p 생성. Child2를 참조
        Parent2 p = new Child2();
        // Child2 클래스에서 객체 c 생성. Child2를 참조
        Child2 c = new Child2();
        // 객체 p,c 는 참조변수로써, 둘 다 Child2 인스턴스를 참조하고 있다.
        // 멤버는 참조변수가 생성된 클래스의 값을 따르지만,
        // 메소드는 참조변수가 참조하는 클래스의 값을 따른다.


        System.out.println("p.x = " + p.x); // 100
        p.method(); // Child Method.
        System.out.println("c.x = " + c.x); // 200
        c.method(); // Child Method
    }
}

class Parent2 {
    // 멤버변수
    int x = 100;


    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    // 부모클래스와 동일한 멤버변수
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
// 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.


public class Exercise7_7 {
    public static void main(String[] args) {
        // Child() 생성자 호출. x = 1000 으로 변경(인스턴스 변수 변경)
        Child c = new Child();

        // getX()의 실행 순서
        // Child() -> Child(int x) -> Parent() -> Parent(int x)
        System.out.println("x= " + c.getX());
    }
}

class Parent {
    int x = 100;

    // 생성자
    // 필드의 값을 200으로 변경
    // Parent(int x) 메소드 호출. Parent(int x)가 존재해야 동작함
    Parent() {
        this(200);
    }

    // 기본 생성자
    // 생성자의 첫 줄에 다른 생성자를 호출하지 않으면 조상의 기본 생성자를 호출하는 super():를 넣는다.
    // int x 매개변수 입력시, 필드 x를 매개변수로 변경
    Parent(int x) {
        // super() ; // Object 클래스를 호출
        this.x = x;
    }

    // 필드의 값을 리턴
    int getX() {
        return x;
    }


}

class Child extends Parent {
    int x = 3000;

    // 생성자
    // Child(int x) 메소드 호출. Child(int x)가 존재해야 동작함
    Child() {
        this(1000);
    }

    // 생성자
    Child(int x) {
        // super() ; // 부모 클래스 Parent 호출
        this.x = x;
    }

//    // 기본 생성자
//    public Child(int x, int x1) {
//        super(x);
//        this.x = x1;
//    }
}



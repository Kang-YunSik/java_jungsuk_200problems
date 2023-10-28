class Product {
    int price;
    int bonusPoint;

    Product() {
    }

    Product(int price) {
        this.price = price;
        bonusPoint = (price/10);
    }
}

class Tv extends Product {

    // 부모 클래스 Product에 기본 생성자가 있어야
    // 자식 클래스 Tv에도 기본 생성자를 정의할 수 있다. (메소드 오버라이딩 원칙)
    // Tv()가 호출되면, 부모 생성자 super()를 호출해야 한다.
    Tv() {
    }

    // Object 클래스의 toString() 재정의
    // print 함수는 toString() 함수를 기본적으로 수행한다.
    public String toString(){
        return "TV";
    }
}

public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t); // TV
    }
}

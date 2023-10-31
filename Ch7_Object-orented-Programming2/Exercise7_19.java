// 물건을 구매하는 Buyer 클래스를 정의해라
// 멤버변수: money, cart
// 기   능
// 메서드명: buy()
// 기   능: 지정된 물건을 구입한다. 가진 돈에서 물건의 가격을 빼고, 장바구니에 담는다. 돈이 적으면 바로 종료
// 반환타입: 없음
// 매개변수: Proudct P

// 메서드명: add()
// 기   능: 지정된 물건을 장바구니에 담는다. 만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
// 반환타입: 없음
// 매개변수: Proudct P

// 메서드명: summary()
// 기   능: 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
// 반환타입: 없음
// 매개변수: 없음
public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.buy(new Audio2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Computer2());

        b.summary();
    }
}

class Buyer {
    // 멤버변수 정의
    int money = 1000; // 가진 돈
    Product2[] cart = new Product2[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // cart에 사용될 index

    // 지정된 물건을 구입하는 메소드
    // Product p 는 Product 클래스의 "p"라는 이름의 객체를 매개변수로 받는다는 뜻
    void buy(Product2 p) {
        // 1-1. 가진 돈과 물건의 가격을 비교하여 가진 돈이 적으면 메서드를 종료한다.
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        }
        // 1-2. 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 뺀다.
        money -= p.price;
        // 1-3. 장바구니에 구입한 물건을 담는다. (add 메소드)
        add(p);
    }

    // 지정된 물건을 장바구니에 담는 메소드
    void add(Product2 p) {
        // 2-1. cart 인데스가 장바구니 크기(length)보다 같거나 크면
        if(i >= cart.length) {
            // 2-2. 기존의 장바구니 보다 2배 큰 새로운 배열을 생성한다.
            // "Product[] tmp"는 Product 클래스의 객체 배열을 나타냅니다.
            // 이 코드에서 "Product[]"는 Product 클래스의 여러 객체를 저장할 수 있는 배열을 선언하는 것을 의미한다.
            // Produc[] 배열에 cart 객체 있고, tmp 객체있고 ...
            Product2[] tmp = new Product2[cart.length*2];
            // 2-3. 기존의 장바구니 내용을 새로운 배열에 복사한다.
            // arraycopy(원본 배열, 시작 위치, 복사하려는 대상, 복사내용 복사할 위치, 끝 위치)
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            // 2-4. 기존의 장바구니를 새로운 장바구니로 바꾼다.
            cart = tmp;
        }
        // 물건을 장바구니에 저장하고, 저장한 후 i를 1 증가시킨다.(후위연산자)
        cart[i++] = p;
    }

    // 구입 후 명세서(구매 품목, 총 금액, 남은 금액
    void summary() {
        // summary() 만의 필드 생성 및 초기화
        String itemList = "";
        int sum = 0;


        for (int i=0; i< cart.length; i++){
            // 3-1. cart가 비어있으면 summary() 종료
            if (cart[i]==null)
                break;
            // 3-2. 장바구니에 담긴 물건들의 목록을 만듬
            itemList += cart[i] + ",";
            // 3-3. 장바구니에 담긴 물건들의 가격을 모두 더함
            sum += cart[i].price;
        }
        // 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
        System.out.println("구입한 물건: " + itemList);
        System.out.println("사용한 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}

class Product2{
    int price; // 제품의 가격

    // 기본 생성자
    public Product2(int price) {
        this.price = price;
    }
}

class Tv2 extends Product2 {
    // Tv2의 가격 정의
    Tv2() {
        super(100); // 부모 클래스의 기본 생성자 호출
    }

    @Override
    public String toString() {
        return "Tv2";
    }
}

class Computer2 extends Product2 {
    // Computer2의 가격 정의
    Computer2() {
        super(200); // 부모 클래스의 기본 생성자 호출
    }

    // toSting(): 자신이 가진 값을 그대로 반환

    @Override
    public String toString() {
        return "Computer2";
    }
}

class Audio2 extends Product2 {
    // Audio2의 가격 정의
    Audio2() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio2";
    }
}

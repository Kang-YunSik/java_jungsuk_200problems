// 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
// 단, 1부터 10까지 적힌 카드가 한 장씩 있고,
// 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 있어야 한다.

public class Exercise7_1 {
    public static void main(String[] args) {
        // deck 객체 생성 (SutdaDeck 클래스에서 생성)
        SutdaDeck deck = new SutdaDeck();

        // deck 객체의 cards 객체의 배열 길이까지 반복문 수행
        for (int i=0; i<deck.cards.length; i++) {
            // deck 객체의 cards 배열객체의 [i]번째 값을 출력
            // 출력하기 전에 info()를 수행
            System.out.print(deck.cards[i].info()+",");
        }
    }
}

// 카드 1장을 정의할 클래스
class SutdaCard {
    // 필드 생성
    int num;
    boolean isKwang;

    // SutdaCard(): 매개변수가 없을 때 num=1, isKwang=true
    SutdaCard() {
        this(1, true);
    }

    // SutdaCard(int, boolean) 매개변수를 받을 때, num=int, isKwang=boolean
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 정의
    public String info() {
        // isKwang이 true면 "k", false면 ""
        return num + (isKwang ? "K" : "");
    }
}

class SutdaDeck {
    // 필드 생성(final 변수=상수)
    final int CARD_NUM = 20;

    // 객체 생성 (SutdaCard 클래스에서 생성)
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // cards 객체는 배열[20]
    SutdaCard cards2 = new SutdaCard(); // cards2 객체는 배열이 아님

    //
    SutdaDeck() {
        // 객체에 인스턴스 변수를 정의하는 반복문
        for (int i=0; i<cards.length; i++) {

            // num 인스턴스 변수에 i%10+1 값 대입
            int num = i%10+1;
            // num이 10보다 작고, 1,3,8일 때 isKwang=true
            boolean isKwang = (i<10) && (num==1||num==3||num==8);

            // cards[i]에 인스턴스 변수를 대입
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
}

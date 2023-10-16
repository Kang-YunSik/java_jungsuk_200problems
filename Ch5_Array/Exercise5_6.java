// 특정 금액을 최소한의 동전 갯수로 바꿔주는 프로그램

public class Exercise5_6 {
    public static void main(String[] args) {

        int[] coinUnit = {500, 100, 50, 10};

        // 동전으로 바꿀 금액
        int money = 2680;
        System.out.println("money="+money);

        /*
        배열에 반복문을 활용한 로직
        1. / 연산을 활용해 각 동전을 줄 수 있는 갯수를 구함.
        2. % 연산을 활용해 동전을 바꾸고 남은 금액 계산
        */
        for (int i=0; i<coinUnit.length; i++) {
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
            money = money%coinUnit[i];
        }
    }
}

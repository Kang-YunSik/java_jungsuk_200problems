package net.hw.javajungsuk;

//num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드
//예를 들어 num=24, result=6

public class Exercise3_6 {
    public static void main(String[] args) {

        int num = 24;
        System.out.println(10-num%10); // num%10을 하면 num의 1의 자릿수가 출력이 되고,
                                        // 10에서 num의 1의 자리수를 빼면 result를 얻을 수있다.
        System.out.println((num/10+1)*10-num); // 요구사항의 순서대로 작성한 방식.
                                                // num의 10의 자리수를 출력하고 +1을 한 뒤, *10을 처리하여 10의 배수를 출력한다.
                                                // 만들어진 10의 배수에서 num을 빼면 result를 얻을 수 있다.
    }
}

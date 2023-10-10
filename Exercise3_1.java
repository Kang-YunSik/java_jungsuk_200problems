package net.hw.javajungsuk;

// 여러가지 연산을 결과
public class Exercise3_1 {
    public static void main(String[] args) {
        // 초기값 설정
        int x = 2; // 정수형 변수 i
        int y = 5; // 정수형 변수 y
        char c = 'A'; // char형(문자형) 변수, ASCII코드

        // 여러가지 연산자
        System.out.println(1 + x << 33); // 비트 쉬프트 연산자. 피연산자 * 2^33
                                        //연산자 우선순위에 따라 3 << 33
                                        //int는 32bit 이므로 33번 쉬프트 한 결과가 아닌 1번 쉬프트 한 결과가 출력된다.
        System.out.printf("1 + x << 33 = %d%n",1 + x << 33);

        System.out.println(y >= 5 || x < 0 && x > 2);// 비교 연산자와 논리 연산자. ||(or): 하나만 참이면 참, &&(and): 둘 다 참일때 참.
                                                    // 연산자 우선순위에 따라 && 수행, || 수행
                                                    // True || false && false
                                                    // True || false
                                                    // True

        System.out.println(y += 10 - x++); // 대입 연산자와 대입 연산자
                                            // y = (y + 10 - x)++
        System.out.println(x); // 후위 연산자 x++의 결과
        System.out.println(x+=2); // 대입 연산자. x = x + 2

        System.out.println(!('A' <= c && c <='Z')); // 대문자 확인 조건식과 논리 부정 연산자. C는 대문자이므로 결과값은 True
                                                    // Ture && True = True

        System.out.println('C'-c); // 데이터형이 서로 다른 이항연산. 피연산자가 int보다 작은 타입(byte, short, char)은 int로 변환한 다음 연산 수행
                                    // c = 'A' = 65 , 'C' = 67
        System.out.println('5'-'0'); // '5' = 53 , '0' = 48
        System.out.println(c+1); // 데이터형이 다른 이항연산. c = 'A' = 65
        System.out.println(++c); // 문자형의 증감 연산자. 'B'
        System.out.println(c++); // 문자형의 증감 연산자. 'B'
        System.out.println(c); // 문자형의 증감 연산자. 'C'
    }
}
// 부족한 점
// 1. 연산자 결과를 print할 때, string을 추가하면 에러 발생. 어떻게 처리?
//      System.out.println("1 + x << 33= " + 1 + x << 33); -> 에러 발생
//      printlin 함수는 "문자열" "변수명" "문자열+변수명"만 작동한다.
//      System.out.printf("1 + x << 33 = %d%n",1 + x << 33); -> 정상 작동. prinft 함수를 활용
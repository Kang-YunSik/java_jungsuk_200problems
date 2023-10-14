package net.hw.javajungsuk;

// 타입이 서로 다른 이항연산
// 여러 가지 데이터 형변환

public class Exercise3_8 {
        public static void main(String[] args) {

            byte a = 10;
            byte b = 20;
            // 이항연산에서 int보다 작은 타입은 int로 자동변환 된다.
            // int(4byte) 보다 작은 타입 = byte(1byte), short(2byte), char(2byte), boolean(1byte)
            byte c = (byte)(a + b); // a,b변수의 타입은 byte 이므로, a+b는 byte타입으로 int로 자동변환되고,
                                    // c변수는 byte 타입으로 a+b를 byte 타입으로 변환해야 한다.

            char ch = 'A'; // byte 타입과 동일한 로직
            ch = (char)(ch + 2);

            // 연산 결과를 적절한 타입으로 변경
            float f = 3 / 2f; // 3/2=1.5 이지만, int 타입이라면 1만 반환된다.
            long l = 3000 * 3000 * 3000L; // 3000*3000*3000=9,000,000,000 으로,
                                        // int 타입의 최대값인 2^31-1(2,147,483,647)보다 크므로 타입 변환이 필요하다.

            // 0.1f == 0.1d = false
            // 0.1을 인코딩했을 때 정확한 값을 표현하지 못하고, 비슷한 값으로 처리
            // float과 double이 각각 표현할 수 있는 유효자리수가 차이나기 때문에 서로 다른 값이다.
            float f2 = 0.1f;
            double d = 0.1;
            boolean result = (float)d==f2;

            System.out.println("c="+c);
            System.out.println("ch="+ch);
            System.out.println("f="+f);
            System.out.println("l="+l);
            System.out.println("result="+result);
        }
}

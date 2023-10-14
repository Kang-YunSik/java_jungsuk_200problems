package net.hw.javajungsuk;

// 화씨(F)를 섭씨(C)로 변환하는 코드. (소수점 둘째자리까지 출력)
// 변환 공식 : C = 5/9 * (F-32)

public class Exercise3_7 {
    public static void main(String[] args) {
        int F = 100;
        float C = (int) (5/9f*(F-32)*100 + 0.5) / 100f;
        // 변환 공식: 5/9f*(F-32) 에서 5/9의 결과는 0이므로 피연산자 중 한 쪽을 float이나 double로 해야만 실수 형태의 결과를 얻음

        // [소수점 셋 째자리에서 반올림 하는 로직]
        // 1. 값에 100을 곱한다 = 37.77778 * 100
        // 2. 1.의 결과에 0.5를 더한다 = 3777.778 + 0.5 → 3778.278
        // 3. 2.의 결과를 int타입으로 변환한다 = (int)3778,278 → 3778
        // 4. 3.의 결과를 100f로 나눈다 = 3778 / 100f → 37.78

        System.out.println("화씨: "+F);
        System.out.println("섭씨: "+C);
        System.out.println("----------");
        System.out.println(5/9f);

    }
}

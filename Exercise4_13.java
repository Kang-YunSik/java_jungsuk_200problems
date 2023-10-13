package net.hw.javajungsuk.Exercise4;

// 문자열이 숫자인지 판별하는 프로그램

public class Exercise4_13 {
    public static void main(String[] args) {

        String str = "12o34";
        //  문자열을 하나씩 읽을 변수 ch 선언
        char ch = ' ';
        // 판별 결과에 따라 출력문을 다르게 하기 위해 inNumber 변수 선언
        boolean isNumber = true;

        for(int i=0; i < str.length() ;i++) {
            // 빈 문자열에 str의 문자를 하나씩 대입
            ch = str.charAt(i);
            // 문자 판별식. ASCII코드를 기준으로 ch를 숫자인지 판별
            if(!('0'<=ch && ch<='9')) {
                // 숫자가 아니라면 수행. inNumber에 false를 대입하고 for문 종료
                isNumber = false;
                break; // for문도 break로 종료할 수 있다.
            }
        }
        if (isNumber) {
            System.out.println(str+"는 숫자입니다.");
        } else {
            System.out.println(str+"는 숫자가 아닙니다.");
        }

    }
}

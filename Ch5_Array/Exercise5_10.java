// 알파벳과 숫자를 주어진 배열로 암호화하는 프로그램 

public class Exercise5_10 {
    public static void main(String[] args) {

        // 암호 배열 정의
        // abcCode : a ~ z
        // numCode : 0 ~ 9
        char[]abcCode=
                {'`','~','!','@','#','$','%','^','&','*',
                '(',')','-','_','+','=','|','[',']',
                '{','}',';',':',',','.','/'};
        char[]numCode = {'q','w','e','r','t','y','u','i','o','p'};

        // 암호화 하고자 하는 변수 src 정의
        // 암호화 결과를 출력해줄 빈 문자열 선언
        String src = "abc123";
        String result = "";

        /* 암호로 변경하는 반복문
        [sudo]
        1. src 문자열을 charAt()으로 한 문자씩 ch 변수에 대입
        1-1. charAt() : String 문자열 중 한 글자만 선택해서 char타입으로 변환해주는 함수
        2. ch 값이 문자인지, 숫자인지 판별
        3. result 문자열에 변환된 값을 하나씩 대입
        */
        for(int i=0; i<src.length();i++){
            char ch = src.charAt(i);

            if('a' <= ch && ch <= 'z'){
                // abcCode의 index를 구하기 위해 ch-'a'
                // 계산결과는 ASCII코드 번호로 출력되며 이는 곧 index번호가 된다.
                result += abcCode[ch-'a'];
            } else if ('0' <= ch && ch <= '9') {
                result += numCode[ch-'0'];
            }
        }
        System.out.println("src: " +src);
        System.out.println("result: "+result);
    }
}

public class Exercise6_22 {

    // isNumber()은 숫자인지 아닌지 판별하는 함수로
    // 공백이거나, 문자가 포함되어 있으면 false를 반환하고
    // 숫자로만 이루어져 있으면 true를 반환한다.
    public static boolean isNumber(String str) {
        // 공백이면 false 반환
        if(str==null || str.equals(""))
            return false;

        for (int i=0; i<str.length(); i++){
            // 1. str 문자열을 하나 씩 문자로 구분하고,
            char ch = str.charAt(i);

            // 2. '0'보다 작거나, '9'보다 크면 false를 반환
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        // 모든 유효성 검사를 마치면, true를 반환
        return true;
    }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str)); // true

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str)); // false
    }
}

// 두 점의 거리를 계산하는 getDistance()를 완성하시오.
public class Exercise6_6 {
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2)); // getDistance 함수 호출
    }

    // static: 같은 클래스 내에서만 접근할 수 있음.
    static double getDistance(int x, int y, int x1, int y1){
        // 두 점 사이의 거리를 계산하는 공식
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}

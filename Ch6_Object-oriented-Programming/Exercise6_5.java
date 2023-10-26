public class Exercise6_5 {
    public static void main(String[] args) {
        Student3 s = new Student3("홍길동", 1,1,100,60,76);

        System.out.println(s.info());
    }
}

// [???] 같은 패키지 안의 같은 클래스 이름이 존재하면 오류가 발생한다.
class Student3 {
    // 필드 선언
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    // Constructor는 객체의 파라미터를 정의할 수 있다.
    // (String name, int ban, int no, int kor, int eng, int math)
    // Student3의 파라미터가 Student3 클래스 필드의 값으로 대입된다.
    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // getTotal 함수 정의
    int getTotal() {
        return kor+eng+math; // 결과 값: kor+eng+math
    }

    // getAverage 함수 정의
    float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; // 결과 값: (int)(getTotal() / 3f * 10 + 0.5f) / 10f
    }

    // info 함수 정의
    // [???] 함수는 String 타입인데, 결과 값은 int, float 등 다양하다. 원래 호환이 안되어야 하지 않나?
    // [ans] ","(String) + 필드를 함으로써 String으로 자동 형변환이 이루어짐.
    public String info() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage();
        // 결과 값: name, ban, no, kor, eng, math, getTotal(), getAverage()
    }
}
// getTotal()과 getAverage() 메소드를 추가하시오.

class Exercise6_4{
    public static void main(String[] args) {
        // 객체 s 생성
        Student2 s = new Student2();
        
        // s의 필드 값 정의
        s.name = "홍길동";
        s.ban = 1;
        s.no = 2;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}

// 클래스 정의
class Student2 {
    
    // 필드 선언
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    // 함수 선언
    // 함수를 선언할 때 리턴의 데이터 타입을 맞춰야 한다.
    int getTotal(){
        return kor+eng+math;
    }

    // 함수 선언
    float getAverage(){
        return (int)getTotal()/3f * 10 + 0.5f;
    }
}

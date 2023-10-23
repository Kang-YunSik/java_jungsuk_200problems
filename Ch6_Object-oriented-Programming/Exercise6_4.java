// getTotal()과 getAverage() 메소드를 추가하시오.

class Exercise6_4{
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}
class Student2 {
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)getTotal()/3f * 10 + 0.5f;
    }
}

package net.hw.javajungsuk;

// 대문자를 소문자로 변경하는 코드
// ASCII코드의 이해와 삼항 연산자

public class Exercise3_10 {
    public static void main(String[] args) {

        char ch = 'A';
        // 'A'의 코드는 65이고, 'a'의 코드는 97이다. 즉, 소문자 코드가 대문자 코드보다 32만큼 크다.
        
        // 삼항 연산자 : (조건문) ? 참일 때 수행문 : 거짓일 때 수행문;
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
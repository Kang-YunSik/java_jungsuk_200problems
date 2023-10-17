// 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 *을 찍어서 그래프를 그리는 프로그램.
// counter 배열의 index = answer 배열의 데이터-1
// counter 배열의 데이터 = answer 배열의 데이터 갯수
public class Exercise5_8 {
    public static void main(String[] args) {
        // 배열 객체 생성
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4]; // 4칸짜리 빈 배열 생성

        // answer 배열의 각 숫자의 개수를 세는 반복문
        for (int i=0; i< answer.length; i++){
            // answer 데이터-1 = counter 배열 index, index에 증감연사자로 갯수 세기
            counter[answer[i]-1]++; // counter[] = {3,2,2,4}
        }

        // answer 배열 출력(줄바꿈X)
        for (int i=0; i< counter.length; i++){
            System.out.print(counter[i]); // 3,2,2,4

            // answer 배열 데이터값에 따라 *출력
            for (int j=0; j<counter[i]; j++){
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}

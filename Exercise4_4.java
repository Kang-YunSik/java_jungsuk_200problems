package net.hw.javajungsuk.Exercise4;

//1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지 구하시오.


public class Exercise4_4 {
    public static void main(String[] args) {
        //[for문으로 작성]
        // 총합 변수 sum
        int sum = 0;
        // 부호 변환을 도와주는 변수 s를 선언하고 작성하는 것이 유리하다.
        int s = 1;
        // 마지막으로 더한 숫자 변수 num
        int num = 0;

        //[1번 for문]
        // for문 증감식에 두 개 이상을 처리할 수 있다.
//        for (int i=1; sum<100 ; i++, s=-s) {
//            num = i*s;
//            sum += i*s;
//        }

        //[2번 for문]
        //for문 안에 if문을 작성하여 실행을 중지시킬 수 있다.
        for (int i = 1; true; i++, s=-s) {
            num = i * s;
            sum += num;

            if (sum >= 100) break;
            }

        System.out.println(num);
        System.out.println(sum);

//        // [while 문으로 작성]
//        int sum=0;
//        int num=0;
//        int s=1;
//        int i=1;
//
//        while (true){
//            num = i*s;
//            sum += num;
//
//            i++;
//            s=-s;
//
//            if (sum >= 100)break;
//        }
//        System.out.println(num);
//        System.out.println(sum);
//    }

    }
}


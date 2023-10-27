public class Exercise6_21 {
    public static void main(String[] args) {
        // 객체 t 선언
        // 인스턴스 클래스 MyTv의 변수들을 사용할 수 있음.
        MyTv t = new MyTv();

        // 객체 t에서 MyTv 클래스의 인스턴스 변수 사용
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // 100, 0

        // 객체 t에서 MyTv 클래스의 인스턴스 메소드 사용
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // 99, 0

        // 객체 t에서 MyTv 클래스의 인스턴스 메소드 사용
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); // 100, 1

    }

}

class MyTv {
    // 인스턴스 변수=필드 선언
    boolean isPowerOn;
    int channel;
    int volume;

    // final 변수 : 데이터 값 변경 불가
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        // isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        isPowerOn = !isPowerOn;
    }

    void volumeUp(){
        // volume이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if(volume < MAX_VOLUME)
            volume++;
    }

    void volumeDown(){
        // volume이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if(volume > MIN_VOLUME)
            volume--;
    }

    void channelUp(){
        // channel이 MAX_CHANNEL보다 작을 때만 값을 1 증가시킨다.
        if(channel < MAX_CHANNEL)
            channel++;
    }

    void channelDown(){
        // channel이 MIN_CHANNEL보다 작을 때만 값을 1 감소시킨다.
        if(channel < MIN_CHANNEL)
            channel--;
    }
}

// MvTv2 클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고,
// 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.

// 이전 채널로 이동하는 기능을 추가
// 메서드명: gotoPreVChannel
// 기   능: 현재 채널을 이전 채널로 변경한다.
// 반환타입: 없음
// 매개변수: 없음

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        // setter 호출:
        t.setChannel(10);
        System.out.println("CH: "+t.getChannel()); // CH:10
        t.setChannel(20);
        System.out.println("CH: "+t.getChannel()); // CH:20
        // 이전 채널로 변경
        t.gotoPrevChannel();
        // getter 호출:
        System.out.println("CH: "+t.getChannel()); // CH:10

    }
}

class MyTv2 {

    // 멤버변수 선언, private 접근 제한자로 클래스 외부에서 접근 불가.
    // Getter, Setter 메소드를 선언하면 접근할 수 있다.
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel; // 이전채널

    final int MAX_VOLUEM = 100 ;
    final int MIN_VOLUEM = 0 ;
    final int MAX_CHANNEL = 100 ;
    final int MIN_CHANNEL = 1 ;

    // getter : 어디서나 getter 메소드로 멤버변수(필드)의 값을 접근할 수 있음.
    // getter 메소드는 멤버변수(필드) 값을 반환
    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    // setter : 어디서나 setter 메소드로 멤버변수(필드)의 값을 변경할 수 있음.
    // setter 메소드는 반환 값이 없다.
    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        prevChannel = this.channel; // 현재 채널을 이전 채널에 저장 (새로운 channel값으로 변경되기 전에 수행)
        this.channel = channel; // 매개변수 channel을 그대로 반환
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel); // 현재 채널을 이전 채널로 변경
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUEM || volume < MIN_VOLUEM)
            return;

        this.volume = volume;
    }
}


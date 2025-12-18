package exam;

public class TVEx {
    public static void main(String[] args) {
        // インスタンス生成
        LgTV tv = new LgTV(new AppleSpeaker());
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();

        tv.setSpeaker(new AppleSpeaker());
    }
}

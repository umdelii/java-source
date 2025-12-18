package exam;

public class AppleSpeaker implements Speaker {

    public AppleSpeaker() {
        System.out.println("AppleSpeaker インスタンス生成");
    }

    @Override
    public void volumeUp() {
        System.out.println("AppleSpeaker Volume UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("AppleSpeaker Volume DOWN");
    }

}

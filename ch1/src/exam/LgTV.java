package exam;

public class LgTV implements TV {

    private Speaker speaker;

    // private Speaker speaker = new AppleSpeaker();
    // setter, 生成者
    public LgTV() {
    }

    public LgTV(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    // ------------------------
    @Override
    public void powerOn() {
        System.out.println("LGTV Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("LGTV Power Off");
    }

    @Override
    public void volumeUp() {
        // System.out.println("LGTV Volume Up");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        // System.out.println("LGTV Volume Down");
        speaker.volumeDown();
    }

}
